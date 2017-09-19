package com.hsy.ai.web.chat.controller;

import com.alibaba.druid.util.StringUtils;
import com.hsy.ai.base.annotation.AspectJLogAnnotation;
import com.hsy.ai.base.common.BaseController;
import com.hsy.ai.base.enums.GlobalConstantsEnum;
import com.hsy.ai.base.utils.BusinessUtils;
import com.hsy.ai.bean.javabean.LoginParam;
import com.hsy.ai.bean.javabean.ResponseBodyBean;
import com.hsy.ai.web.chat.utils.ConstantsUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
@RequestMapping("/sso")
public class SsoController extends BaseController {
    private final Logger _logger = LoggerFactory.getLogger(this.getClass()) ;

    @AspectJLogAnnotation(description = "访问登陆页",saveToDb = true)
    @RequestMapping(value="/loginView.do")
    public String loginView(){
        return  "/sso/login";
    }

    @AspectJLogAnnotation(description = "登陆系统",saveToDb = true)
    @RequestMapping("/login.do")
    public String login(String json,HttpServletRequest request,HttpServletResponse response){
        _logger.info("进入 /user/login.do ...入参：{}",json);
        /*ConstantsUtils.requestThreadLocal = new ThreadLocal<HttpServletRequest>(){
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
        };*/
        /*if(StringUtils.equals("",(String) request.getSession().getAttribute(GlobalConstantsEnum.KEY_SESSION_IMAGE_CODE.getCode()))){

        }*/
        return "/chat/chat" ;
    }


}
