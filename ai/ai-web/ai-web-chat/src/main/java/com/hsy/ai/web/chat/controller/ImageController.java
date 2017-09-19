package com.hsy.ai.web.chat.controller;

import com.hsy.ai.base.annotation.AspectJLogAnnotation;
import com.hsy.ai.base.common.BaseController;
import com.hsy.ai.base.enums.GlobalConstantsEnum;
import com.hsy.ai.base.utils.BusinessUtils;
import com.hsy.ai.bean.javabean.LoginParam;
import com.hsy.ai.bean.javabean.ResponseBodyBean;
import com.hsy.java.base.string.StringHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;

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
@RequestMapping("/code")
public class ImageController extends BaseController {
    private final Logger _logger = LoggerFactory.getLogger(this.getClass()) ;

    @AspectJLogAnnotation(description = "获取验证码",saveToDb = true)
    @RequestMapping(value = "/getCode.do",method = RequestMethod.POST)
    public @ResponseBody ResponseBodyBean<Object> getCode(String json, HttpSession session){
        _logger.info("进入 /sso/getCode.do ...");
        String code = StringHelper.generateRandomOfStringByLength(4) ;
        session.setAttribute(GlobalConstantsEnum.KEY_SESSION_IMAGE_CODE.getCode(),code);
        _logger.info("退出 /sso/getCode.do ...");
        return this.success(code) ;
    }
    @RequestMapping("/getImgCode.do")
    public @ResponseBody ResponseBodyBean<Object> getCode(HttpServletResponse response, HttpSession session){
        _logger.info("进入 /sso/getImgCode.do ...");
        //设置响应头通知浏览器以图片的形式打开
        response.setContentType("image/jpeg");// 等同于response.setHeader("Content-Type",
        //设置响应头控制浏览器不要缓存
        response.setDateHeader("expries", -1);
        response.setHeader("Cache-Control", "no-cache");
        response.setHeader("Pragma", "no-cache");
        //生产验证码
        String capText = StringHelper.generateCertificationCode() ;
        //验证码文本存入session
        session.setAttribute(GlobalConstantsEnum.KEY_SESSION_IMAGE_CODE.getCode(), capText);
        //BufferedImage bi = captchaProducer.createImage(capText);
        ServletOutputStream out = null;
        try {
            out = response.getOutputStream();
            //ImageIO.write(bi, "jpg", out);
            out.flush();
        } catch (Exception e) {
            _logger.error("生成验证码响应流发生异常", e);
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (Exception e) {
                    _logger.error("验证码关闭流发生异常", e);
                    e.printStackTrace();
                }
            }
        }
        return super.failure() ;
    }

}
