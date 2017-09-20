package com.hsy.ai.base.enums;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path framework/com.hsy.enums
 * @date 23/08/2017 11:06 AM
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public enum GlobalConstantsEnum {

    KEY_SESSION_IMAGE_CODE("key_session_image_code", "图片验证码"),
    KEY_SESSION_IS_TIME_OUT("key_session_is_time_out", "会话超时"),
    KEY_SESSION_USERINFO("sessionKeyUserinfo","session的key"),
    // 系统异常
    RETURN_COMMON_FAILURE("AI9999","操作失败，请联系管理员!"),
    RETURN_COMMON_SUCCESS("AI0000","操作成功！"),
    // 数据库操作异常
    DB_SELECT_IS_NULL("AI2000","db select return null"),
    DB_INSERT_RESULT_ERROR("AI2001", "db insert error"),
    DB_UPDATE_RESULT_ERROR("AI2002", "db update error"),

    // 用户相关异常
    INVALID_USER("1001001", "无效用户"),

    // 系统配置
    SYSTEM_SOURCE_CHAT("ai-chat","智能聊天系统"),
    SYSTEM_SOURCE_IMAGE("ai-image","智能图像识别系统"),
    SYSTEM_SOURCE_VOICE("ai-voice","智能语音识别系统"),

    // 加密方式
    SECRET_TYPE_BASE64("BASE64","base64加密方式"),
    SECRET_TYPE_AES("AES","AES加密方式"),
    SECRET_TYPE_MD5("MD5","MD5加密方式"),

    // 代码异常
    EXCEPTION_NULL_POINTER("AI40001","空指针异常")
    ;
    private String code ;
    private String msg ;

    GlobalConstantsEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
