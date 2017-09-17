package com.hsy.ai.web.chat.controller;

import com.hsy.ai.base.annotation.AspectJLogAnnotation;
import com.hsy.ai.base.common.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author heshiyuan
 * @description <p>根路径</p>
 * @path ai/com.hsy.ai.web.chat.controller
 * @date 2017/9/17 10:02
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@Controller
public class IndexController extends BaseController {
    @AspectJLogAnnotation(description = "访问首页",saveToDb = true)
    @RequestMapping(value="/",method = RequestMethod.GET)
    public String index(){
        return "/sso/login" ;
    }

}
