package com.hsy.ai.service.common.impl;

import com.hsy.ai.bean.entity.TAiLog;
import com.hsy.ai.bean.entity.TAiUser;
import com.hsy.ai.dao.common.dao.TAiLogMapper;
import com.hsy.ai.dao.common.dao.TAiUserMapper;
import com.hsy.ai.service.common.ITAiLogService;
import com.hsy.ai.service.common.ITAiUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path ai/com.hsy.ai.service.log.impl
 * @date 2017/9/17 16:42
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@Service("iTAiUserService")
public class TAiUserServiceImpl implements ITAiUserService {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    TAiUserMapper tAiUserMapper ;

    @Override
    public int saveUser(TAiUser user) {
        return tAiUserMapper.insert(user) ;
    }

    @Override
    public long countByParam(TAiUser user) {
        return tAiUserMapper.countByParam(user);
    }
}

