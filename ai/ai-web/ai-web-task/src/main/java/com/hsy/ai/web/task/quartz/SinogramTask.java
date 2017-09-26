package com.hsy.ai.web.task.quartz;

import com.hsy.ai.service.chat.ITAiChatSinogramService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path framework/com.hsy.quartz
 * @date 23/08/2017 11:33 AM
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@Component
public class SinogramTask {
    private final static Logger _logger = LoggerFactory.getLogger(SinogramTask.class) ;

    @Autowired
    ITAiChatSinogramService iTAiChatSinogramService ;
    /**
     * @description <p>每一分钟发起一次去重请求</p>
     * @author heshiyuan
     * @date 23/08/2017 11:45 AM
     * @email shiyuan4work@sina.com
     * @github https://github.com/shiyuan2he.git
     * Copyright (c) 2016 shiyuan4work@sina.com All rights reserved
     */
    @Scheduled(cron = "0 0/1 * * * ? ")
    public void addScore(){
        _logger.info("每1分钟给发起去重请求");
        iTAiChatSinogramService.sinogramDuplicateRemoval() ;
    }
}
