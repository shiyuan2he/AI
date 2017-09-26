package com.hsy.ai.service.common.thread;
import com.hsy.ai.bean.entity.TAiLog;
import com.hsy.ai.service.common.ITAiLogService;
/**
 * @author heshiyuan
 * @description <p></p>
 * @path ai-web-chat/com.hsy.thread
 * @date 23/08/2017 5:38 PM
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class LogThread implements Runnable {

    TAiLog log ;
    ITAiLogService iTAiLogService ;

    public LogThread(TAiLog log,ITAiLogService logService ){
        this.log = log ;
        this.iTAiLogService = logService ;
    }
    @Override
    public void run() {
        iTAiLogService.saveAiLog(log) ;
    }
}
