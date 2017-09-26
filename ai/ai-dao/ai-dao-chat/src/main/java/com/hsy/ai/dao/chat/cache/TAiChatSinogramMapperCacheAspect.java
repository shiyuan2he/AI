package com.hsy.ai.dao.chat.cache;

import com.hsy.ai.base.utils.ConstantsUtils;
import com.hsy.ai.bean.entity.TAiChatSinogram;
import com.hsy.java.util.cache.redis.CacheBase;
import org.aspectj.lang.annotation.Pointcut;

import java.util.concurrent.TimeUnit;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path ai/com.hsy.ai.dao.chat.cache
 * @date 25/09/2017 6:02 PM
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class TAiChatSinogramMapperCacheAspect extends CacheBase<TAiChatSinogram>{

    @Pointcut("execution(public * com.hsy.ai.dao.chat.dao.TAiChatSinogramMapper.selectByExample(..))")
    @Override
    protected void cacheAspect() {}

    @Override
    protected String getKey() {
        return ConstantsUtils.AI_DAO_CHAT_LIST_KEY + ":sinogram";
    }

    @Override
    protected long getTimeOut() {
        return ConstantsUtils.AI_DAO_CHAT_LIVE_TIME * 60;
    }

    @Override
    protected TimeUnit getTimeUnit() {
        return TimeUnit.MINUTES;
    }
}
