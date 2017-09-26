package com.hsy.ai.service.chat.thread;

import com.hsy.ai.service.chat.ITAiChatSinogramService;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path ai/com.hsy.ai.service.chat.thread
 * @date 23/09/2017 7:31 PM
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class SinogramThread implements Runnable{
    String message ;
    ITAiChatSinogramService iTAiChatSinogramService ;

    public SinogramThread(String message, ITAiChatSinogramService itAiChatSinogramService){
        this.message = message ;
        this.iTAiChatSinogramService = itAiChatSinogramService ;
    }
    @Override
    public void run() {
        iTAiChatSinogramService.saveAiChatSinogram(message) ;
    }
}
