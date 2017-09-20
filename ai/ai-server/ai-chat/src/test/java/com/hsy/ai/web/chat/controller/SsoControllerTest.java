package com.hsy.ai.web.chat.controller;
import com.hsy.ai.base.utils.BusinessUtils;
import com.hsy.ai.bean.javabean.LoginParam;
import com.hsy.ai.bean.javabean.RequestBodyBean;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path framework/com.hsy.web
 * @date 21/08/2017 9:12 AM
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class SsoControllerTest extends JUnit4ControllerBase {
    private final static Logger _logger = LoggerFactory.getLogger(SsoControllerTest.class) ;

    @Test
    public void testLogin(){
        RequestBodyBean<LoginParam> requestJson = new RequestBodyBean<>() ;
        LoginParam login = new LoginParam() ;
        login.setTel("26767604315");
        login.setCode("2222");
        requestJson.setParam(login);
        requestJson.setKey("");
        requestJson.setRequestTime(String.valueOf(System.currentTimeMillis()));
        String requestJsonStr = BusinessUtils.requestBeanToJson(requestJson) ;
        _logger.info("请求json串：{}",requestJsonStr);
        this.postJsonRequest("/user/login.do",requestJsonStr);
    }
}
