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
    /**
     * @description <p>从爬虫服务获取的汉字字符串</p>
     * @param
     * @return 保存成功记录数
     * @author heshiyuan 
     * @date 23/09/2017 7:44 PM 
     * @email shiyuan4work@sina.com
     * @github https://github.com/shiyuan2he.git
     * Copyright (c) 2016 shiyuan4work@sina.com All rights reserved
     */
    int saveAiChatSinogram(String sinogram) ;

    /**
     * @description <p>汉字去重</p>
     * @param
     * @return No such property: code for class: Script1
     * @author heshiyuan
     * @date 24/09/2017 4:39 PM
     * @email shiyuan4work@sina.com
     * @github https://github.com/shiyuan2he.git
     * Copyright (c) 2016 shiyuan4work@sina.com All rights reserved
     */
    int sinogramDuplicateRemoval() ;
}
