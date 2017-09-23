package com.hsy.ai.service.chat.impl;

import com.hsy.ai.bean.entity.TAiChatSinogram;
import com.hsy.ai.dao.chat.dao.TAiChatSinogramMapper;
import com.hsy.ai.service.chat.ITAiChatSinogramService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author heshiyuan
 * @author shiyuan2he
 * @description <p></p>
 * @path ai/com.hsy.ai.service.chat.impl
 * @date 2017/9/22 22:20
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class TAiChatSinogramServiceImpl implements ITAiChatSinogramService {
    @Autowired
    TAiChatSinogramMapper tAiChatSinogramMapper ;
    @Override
    public int saveAiChatSinogram(TAiChatSinogram sinogram) {
        return tAiChatSinogramMapper.insert(sinogram);
    }
}
