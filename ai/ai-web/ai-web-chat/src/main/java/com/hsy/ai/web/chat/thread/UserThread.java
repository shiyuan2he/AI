package com.hsy.ai.web.chat.thread;

import com.hsy.ai.base.enums.GlobalConstantsEnum;
import com.hsy.ai.bean.entity.TAiLog;
import com.hsy.ai.bean.entity.TAiUser;
import com.hsy.ai.bean.entity.TAiUserExample;
import com.hsy.ai.service.common.ITAiLogService;
import com.hsy.ai.service.common.ITAiUserService;
import com.hsy.ai.web.chat.exception.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    private final Logger _logger = LoggerFactory.getLogger(this.getClass()) ;
    TAiUser user ;
    ITAiUserService iTAiUserService ;

    public UserThread(TAiUser user, ITAiUserService userService ){
        this.user = user ;
        this.iTAiUserService = userService ;
    }
    @Override
    public void run() {

        if(iTAiUserService.countByParam(new TAiUser(user.getPhone())) >= 1){
            _logger.info("数据库已经存在{}的数据，此次不更新数据库！","{"+user.toString()+"}");
            return ;
        }
        _logger.info("正在将{}用户信息存进数据库当中！","{"+user.toString()+"}");
        try{
            if(iTAiUserService.saveUser(user) < 1){
                _logger.info("保存用户没有成功！");
            }else{
                _logger.info("保存用户成功！");
            }
        }catch(Exception e){
            _logger.info("保存用户出现异常！");
            throw new BusinessException(GlobalConstantsEnum.DB_INSERT_RESULT_ERROR.getCode(), GlobalConstantsEnum.DB_INSERT_RESULT_ERROR.getMsg());
        }
    }
}
