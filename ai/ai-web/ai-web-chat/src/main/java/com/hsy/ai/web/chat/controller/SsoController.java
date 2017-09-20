package com.hsy.ai.web.chat.controller;

import com.alibaba.druid.util.StringUtils;
import com.hsy.ai.base.annotation.AspectJLogAnnotation;
import com.hsy.ai.base.common.BaseController;
import com.hsy.ai.base.enums.GlobalConstantsEnum;
import com.hsy.ai.base.utils.BusinessUtils;
import com.hsy.ai.bean.entity.TAiUser;
import com.hsy.ai.bean.javabean.LoginParam;
import com.hsy.ai.bean.javabean.ResponseBodyBean;
import com.hsy.ai.service.common.ITAiLogService;
import com.hsy.ai.service.common.ITAiUserService;
import com.hsy.ai.web.chat.thread.LogThread;
import com.hsy.ai.web.chat.thread.UserThread;
import com.hsy.ai.web.chat.thread.pool.FixedThreadPool;
import com.hsy.ai.web.chat.utils.ConstantsUtils;
import com.hsy.java.base.secure.Base64Helper;
import com.hsy.java.base.string.StringHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

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

    @Autowired
    FixedThreadPool fixedThreadPool ;
    @Autowired
    ITAiUserService iTAiUserService ;

    @AspectJLogAnnotation(description = "访问登陆页",saveToDb = true)
    @RequestMapping(value="/loginView.do")
    public String loginView(){
        return  "/sso/login";
    }

    @AspectJLogAnnotation(description = "登陆系统",saveToDb = true)
    @RequestMapping(value = "/login.do",method = RequestMethod.POST)
    public @ResponseBody ResponseBodyBean<Object> login(@RequestBody String json, HttpServletRequest request, HttpServletResponse response){
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
        LoginParam login = BusinessUtils.requestJsonToBean(json,LoginParam.class) ;
        String sessionCode = (String) request.getSession().getAttribute(GlobalConstantsEnum.KEY_SESSION_IMAGE_CODE.getCode()) ;
        // 前端传递code跟session保存code值一致，即可算登陆成功
        if(StringUtils.equals(login.getCode(),sessionCode)){
            TAiUser user = new TAiUser() ;
            String id = StringHelper.generateRandomOfStringByLength(20) ;
            user.setId(id);
            user.setCreateTime(new Date());
            user.setCreateUser(id);
            user.setEncryptType(GlobalConstantsEnum.SECRET_TYPE_BASE64.getCode());
            user.setPassword(Base64Helper.stringToBase64(login.getCode()));
            user.setPhone(login.getTel());
            fixedThreadPool.getFixedThreadPool().execute(new UserThread(user,iTAiUserService)) ;
            return this.success("登陆成功") ;
        }
        return this.failure() ;
    }


}
