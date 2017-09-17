package com.hsy.ai.service.log.impl;

import com.hsy.ai.bean.entity.TAiLog;
import com.hsy.ai.dao.log.TAiLogMapper;
import com.hsy.ai.service.log.ITAiLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author heshiyuan
 * @author shiyuan2he
 * @description <p></p>
 * @path ai/com.hsy.ai.service.log.impl
 * @date 2017/9/17 16:42
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@Service("iTAiLogService")
public class TAiLogServiceImpl implements ITAiLogService {

    @Autowired
    TAiLogMapper tAiLogMapper ;
    @Override
    public int saveAiLog(TAiLog log) {
        tAiLogMapper.insert(log) ;
    }
}
