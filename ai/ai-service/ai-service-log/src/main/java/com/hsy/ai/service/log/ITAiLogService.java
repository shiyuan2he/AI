package com.hsy.ai.service.log;

import com.hsy.ai.bean.entity.TAiLog;

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
public interface ITAiLogService {
    /**
     * @description <p>保存日志</p>
     * @author heshiyuan
     * @date 2017/9/17 16:41
     * @email shiyuan4work@sina.com
     * @github https://github.com/shiyuan2he.git
     * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved
     */
    int saveAiLog(TAiLog log) ;
}
