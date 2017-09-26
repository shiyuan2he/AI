package com.hsy.ai.service.common.thread;
import com.hsy.ai.bean.entity.TAiUser;
import com.hsy.ai.service.common.ITAiUserService;
/**
 * @author heshiyuan
 * @description <p>保存用户信息线程</p>
 * @path ai-web-chat/com.hsy.thread
 * @date 23/08/2017 5:38 PM
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class UserThread implements Runnable {

    TAiUser user ;
    ITAiUserService iTAiUserService ;

    public UserThread(TAiUser user, ITAiUserService userService ){
        this.user = user ;
        this.iTAiUserService = userService ;
    }
    @Override
    public void run() {
        iTAiUserService.saveUser(user) ;
    }
}
