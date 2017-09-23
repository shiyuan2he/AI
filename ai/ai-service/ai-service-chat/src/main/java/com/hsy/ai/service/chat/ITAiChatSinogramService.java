package com.hsy.ai.service.chat;

import com.hsy.ai.bean.entity.TAiChatSinogram;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path ai/com.hsy.ai.service.chat
 * @date 2017/9/22 22:20
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public interface ITAiChatSinogramService {

    /**
     * @author heshiyuan
     * @description <p>保存中文汉字字典</p>
     * @path ai/com.hsy.ai.service.chat
     * @date 2017/9/22 22:20
     * @github http://github.com/shiyuan2he
     * @email shiyuan4work@sina.com
     * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
     * @price ¥5    微信：hewei1109
     */
    int saveAiChatSinogram(TAiChatSinogram sinogram) ;
}
