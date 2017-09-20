package com.hsy.ai.service.common;
import com.hsy.ai.bean.entity.TAiUser;
/**
 * @author heshiyuan
 * @description <p></p>
 * @path ai/com.hsy.ai.chat.service
 * @date 15/09/2017 2:40 PM
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public interface ITAiUserService {
    /**
     * @description <p>保存日志</p>
     * @author heshiyuan
     * @date 2017/9/17 16:41
     * @email shiyuan4work@sina.com
     * @github https://github.com/shiyuan2he.git
     * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved
     */
    int saveUser(TAiUser user) ;
    /**
     * @description <p>计算数量</p>
     * @param
     * @return No such property: code for class: Script1
     * @author heshiyuan
     * @date 20/09/2017 2:23 PM
     * @email shiyuan4work@sina.com
     * @github https://github.com/shiyuan2he.git
     * Copyright (c) 2016 shiyuan4work@sina.com All rights reserved
     */
    long countByParam(TAiUser user) ;
}
