package com.hsy.ai.service.chat.impl;

import com.hsy.ai.bean.entity.TAiChatSinogram;
import com.hsy.ai.bean.entity.TAiChatSinogramExample;
import com.hsy.ai.dao.chat.dao.TAiChatSinogramMapper;
import com.hsy.ai.service.chat.ITAiChatSinogramService;
import com.hsy.java.base.regex.RegexHelper;
import com.hsy.java.base.string.StringHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

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
@Service("iTAiChatSinogramService")
public class TAiChatSinogramServiceImpl implements ITAiChatSinogramService {
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    TAiChatSinogramMapper tAiChatSinogramMapper ;
    @Override
    public int saveAiChatSinogram(TAiChatSinogram sinogram) {
        return tAiChatSinogramMapper.insert(sinogram);
    }

    @Override
    public int saveAiChatSinogram(String sinogram) {
        // 过滤掉非汉字
        String newSinogram = "" ;
        try {
            newSinogram = RegexHelper.sinogramIntercept(sinogram) ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        for(int i=0;i<newSinogram.length();i++){
            char charStr = newSinogram.charAt(i) ;
            TAiChatSinogram tAiChatSinogram = new TAiChatSinogram() ;
            tAiChatSinogram.setId(StringHelper.generateRandomOfStringByLength(20));
            tAiChatSinogram.setCreateTime(new Date());
            tAiChatSinogram.setCreateUser("0");
            tAiChatSinogram.setCode(String.valueOf(charStr));
            tAiChatSinogram.setMessage(String.valueOf(charStr));
            tAiChatSinogram.setMessageLength(1);
            tAiChatSinogramMapper.insertSelective(tAiChatSinogram) ;
        }
        return 0;
    }

    @Override
    public int sinogramDuplicateRemoval() {
        TAiChatSinogramExample example = new TAiChatSinogramExample() ;
        example.setLimit(0);
        example.setOffset(100);
        //tAiChatSinogramMapper.selectByExample() ;
        return 0;
    }
}
