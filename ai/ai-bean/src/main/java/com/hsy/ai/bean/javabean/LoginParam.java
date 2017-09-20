package com.hsy.ai.bean.javabean;

/**
 * @author heshiyuan
 * @author shiyuan2he
 * @description <p></p>
 * @path framework/com.hsy.bean.javabean
 * @date 2017/8/21 21:18
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class LoginParam extends RequestParamGenericityBean{
    private String tel ;//登陆手机号
    private String code ;//登陆验证码

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
