package com.hsy.ai.web.mq.consumer;

import com.hsy.ai.service.chat.ITAiChatSinogramService;
import com.hsy.ai.service.chat.thread.SinogramThread;
import com.hsy.java.thread.pool.FixedThreadPool;
import com.hsy.java.util.rabbitmq.RabbitmqHelper;
import com.rabbitmq.client.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path ai/com.hsy.ai.consumer.chat.rabbitmq
 * @date 22/09/2017 4:26 PM
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@Component
public class RabbitConsumer {
    private static final Logger _logger = LoggerFactory.getLogger(RabbitConsumer.class);
    public static String QUEUE_NAME = null ;
    public static String QUEUE_HOST = null ;
    public static Integer QUEUE_PORT = 0 ;
    public static String QUEUE_USER_NAME = null ;
    public static String QUEUE_PASSWORD = null ;
    static{
        Properties prop = new Properties();
        FileInputStream in = null;
        String path = "/properties/rabbitmq.properties" ;
        try {
            _logger.info("正在读取rabbitmq配置文件");
            path = RabbitConsumer.class.getResource(path).getPath() ;
            in = new FileInputStream(path);
            prop.load(in);
            QUEUE_NAME = prop.getProperty("rabbitmq.queue.sinogram.name") ;
            QUEUE_HOST = prop.getProperty("rabbitmq.queue.host") ;
            QUEUE_PORT = Integer.parseInt(prop.getProperty("rabbitmq.queue.port")) ;
            QUEUE_USER_NAME = prop.getProperty("rabbitmq.queue.username") ;
            QUEUE_PASSWORD = prop.getProperty("rabbitmq.queue.password") ;
            in.close();
        } catch (FileNotFoundException e) {
            _logger.error("去读{}配置文件发生异常，异常信息：{}",path,e.getMessage());
        } catch (IOException e1) {
            _logger.error("去读{}配置文件发生异常，异常信息：{}",path,e1.getMessage());
        }
    }
    @Autowired
    FixedThreadPool fixedThreadPool ;
    @Autowired
    ITAiChatSinogramService itAiChatSinogramService ;
    /**
     * @description <p>
     *     注1：queueDeclare第一个参数表示队列名称、第二个参数为是否持久化（true表示是，队列将在服务器重启时生存,durable-持久化）、
     *     第三个参数为是否是独占队列（创建者可以使用的私有队列，断开后自动删除）、
     *     第四个参数为当所有消费者客户端连接断开时是否自动删除队列、第五个参数为队列的其他参数
     * </p>
     * @param
     * @return No such property: code for class: Script1
     * @author heshiyuan
     * @date 22/09/2017 5:52 PM
     * @email shiyuan4work@sina.com
     * @github https://github.com/shiyuan2he.git
     * Copyright (c) 2016 shiyuan4work@sina.com All rights reserved
     */
    @PostConstruct
    public void getConsumer(){
        _logger.info("正在建立rabbitmq消费者");
        //创建一个通道
        Channel channel = null;
        try {
            channel = RabbitmqHelper.getInstance(QUEUE_NAME,QUEUE_HOST,QUEUE_PORT,QUEUE_USER_NAME,QUEUE_PASSWORD)
                    .getConnection(true).createChannel();
            _logger.info("成功建立rabbitmq连接通道");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //声明要关注的队列
        try {
            channel.queueDeclare(QUEUE_NAME, true, false, false, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //DefaultConsumer类实现了Consumer接口，通过传入一个频道，
        // 告诉服务器我们需要那个频道的消息，如果频道中有消息，就会执行回调函数handleDelivery
        Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope,
                                       AMQP.BasicProperties properties, byte[] body)
                    throws IOException {
                String message = new String(body, "UTF-8");
                _logger.info("【rabbitmq消费者】接收到消费消息：{}",message);
                fixedThreadPool.getFixedThreadPool().execute(new SinogramThread(message,itAiChatSinogramService));
            }
        };
        //自动回复队列应答 -- RabbitMQ中的消息确认机制
        try {
            channel.basicConsume(QUEUE_NAME, true, consumer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
