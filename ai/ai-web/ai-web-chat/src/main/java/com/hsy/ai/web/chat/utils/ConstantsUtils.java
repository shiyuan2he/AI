package com.hsy.ai.web.chat.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path framework/com.hsy.Utils
 * @date 18/08/2017 11:10 AM
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class ConstantsUtils {
    public static ThreadLocal<HttpServletRequest> requestThreadLocal = null;

    public static ThreadLocal<HttpServletResponse> responseThreadLocal = null;
}
