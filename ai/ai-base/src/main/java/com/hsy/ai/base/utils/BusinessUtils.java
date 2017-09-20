package com.hsy.ai.base.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.hsy.ai.bean.javabean.RegisterParam;
import com.hsy.ai.bean.javabean.RequestBodyBean;
import com.hsy.java.base.json.JsonHelper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path framework/com.hsy.utils
 * @date 18/08/2017 11:59 AM
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class BusinessUtils {
    private final static Logger _logger = LoggerFactory.getLogger(BusinessUtils.class) ;
    /**
     * @description <p></p>
     * @param
     * @return No such property: code for class: Script1
     * @author heshiyuan
     * @date 18/08/2017 1:09 PM 
     * @email shiyuan4work@sina.com
     * @github https://github.com/shiyuan2he.git
     * Copyright (c) 2016 shiyuan4work@sina.com All rights reserved
     */
    public static <T> T requestJsonToBean(String json,Class<T> clazz){
        if(null == json || "".equals(json)) return  null;
        try{
            if(json.contains("\\")) {
                json = json.replace("\\","");
            }
            RequestBodyBean<T> requestBody =  JSON.parseObject(json,new TypeReference<RequestBodyBean>(){}) ;
            return JSON.parseObject(requestBeanToJson(requestBody.getParam()),clazz) ;
        }catch(Exception e){
            _logger.error("请求参数解析错误,json数据是:{}",json);
        }
        return null ;
    }
    /**
     * @description <p></p>
     * @param
     * @return No such property: code for class: Script1
     * @author heshiyuan
     * @date 18/08/2017 1:09 PM
     * @email shiyuan4work@sina.com
     * @github https://github.com/shiyuan2he.git
     * Copyright (c) 2016 shiyuan4work@sina.com All rights reserved
     */
    public static String requestBeanToJson(Object obj){
        return JsonHelper.obj2Json(obj) ;
    }
}
