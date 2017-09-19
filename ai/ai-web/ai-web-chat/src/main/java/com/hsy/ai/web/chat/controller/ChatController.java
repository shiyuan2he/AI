package com.hsy.ai.web.chat.controller;

import com.alibaba.druid.util.StringUtils;
import com.hsy.ai.base.annotation.AspectJLogAnnotation;
import com.hsy.ai.base.common.BaseController;
import com.hsy.ai.base.enums.GlobalConstantsEnum;
import com.hsy.ai.bean.javabean.ResponseBodyBean;
import com.hsy.ai.web.chat.utils.ConstantsUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author heshiyuan
 * @description <p>模拟sso单点登录</p>
 * @path ai/com.hsy.ai.web.chat.controller
 * @date 2017/9/17 10:02
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@Controller
@RequestMapping("/chat")
public class ChatController extends BaseController {
    private final Logger _logger = LoggerFactory.getLogger(this.getClass()) ;

    @AspectJLogAnnotation(description = "聊天",saveToDb = true)
    @RequestMapping("/chat.do")
    public @ResponseBody ResponseBodyBean<Object> chat(String json, HttpServletRequest request, HttpServletResponse response){
        _logger.info("进入 /chat/chat.do ...入参：{}",json);
        ConstantsUtils.requestThreadLocal = new ThreadLocal<HttpServletRequest>(){
            @Override
            protected HttpServletRequest initialValue() {
                return request ;
            }
        };
        ConstantsUtils.responseThreadLocal =  new ThreadLocal<HttpServletResponse>(){
            @Override
            protected HttpServletResponse initialValue() {
                return response ;
            }
        };
        return this.failure() ;
    }


}
