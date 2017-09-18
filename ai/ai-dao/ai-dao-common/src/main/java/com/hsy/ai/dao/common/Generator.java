package com.hsy.ai.dao.common;

import com.hsy.ai.base.utils.MybatisGeneratorUtil;
import com.hsy.ai.base.utils.PropertiesFileHelper;

import java.util.HashMap;
import java.util.Map;

/**
 * @description <p></p>
 * @author heshiyuan
 * @date 04/09/2017 11:34 AM
 * @email shiyuan4work@sina.com
 * @github https://github.com/shiyuan2he.git
 * Copyright (c) 2016 shiyuan4work@sina.com All rights reserved
 */
public class Generator {

    // 根据命名规范，只修改此常量值即可
    private static String MODULE = "ai-dao-common";
    private static String DATABASE = "ai";
    private static String TABLE_PREFIX = "t_ai";
    private static String PACKAGE_NAME = "com.hsy.ai.dao.common" ;
    private static String JDBC_DRIVER = PropertiesFileHelper.getInstance("generator").get("generator.jdbc.driver");
    private static String JDBC_URL = PropertiesFileHelper.getInstance("generator").get("generator.jdbc.url");
    private static String JDBC_USERNAME = PropertiesFileHelper.getInstance("generator").get("generator.jdbc.username");
    private static String JDBC_PASSWORD = PropertiesFileHelper.getInstance("generator").get("generator.jdbc.password");
    // 需要insert后返回主键的表配置，key:表名,value:主键名
    private static Map<String, String> LAST_INSERT_ID_TABLES = new HashMap<>();
    static {
        LAST_INSERT_ID_TABLES.put("t_ai_log", "id");
        LAST_INSERT_ID_TABLES.put("t_ai_user", "id");
    }

    /**
     * 自动代码生成
     * @param args
     */
    public static void main(String[] args) throws Exception {
        MybatisGeneratorUtil.generator(JDBC_DRIVER, JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD, MODULE, DATABASE, TABLE_PREFIX, PACKAGE_NAME, LAST_INSERT_ID_TABLES);
    }

}