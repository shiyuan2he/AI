package com.hsy.ai.service.common.impl;

import com.hsy.ai.base.enums.GlobalConstantsEnum;
import com.hsy.ai.base.exception.BusinessException;
import com.hsy.ai.bean.entity.TAiLog;
import com.hsy.ai.bean.entity.TAiUser;
import com.hsy.ai.dao.common.dao.TAiLogMapper;
import com.hsy.ai.dao.common.dao.TAiUserMapper;
import com.hsy.ai.service.common.ITAiLogService;
import com.hsy.ai.service.common.ITAiUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path ai/com.hsy.ai.service.log.impl
 * @date 2017/9/17 16:42
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@Service("iTAiUserService")
public class TAiUserServiceImpl implements ITAiUserService {
    private final Logger _logger = LoggerFactory.getLogger(this.getClass()) ;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    TAiUserMapper tAiUserMapper ;

    @Override
    public int saveUser(TAiUser user) {
        if(tAiUserMapper.countByParam(new TAiUser(user.getPhone())) >= 1){
            _logger.info("数据库已经存在{}的数据，此次不更新数据库！","{"+user.toString()+"}");
        }
        _logger.info("正在将{}用户信息存进数据库当中！","{"+user.toString()+"}");
        try{
            int count = tAiUserMapper.insert(user) ;
            if(count < 1){
                _logger.info("保存用户没有成功！");
            }else{
                _logger.info("保存用户成功！");
                return count ;
            }
        }catch(Exception e){
            _logger.info("保存用户出现异常！");
            throw new BusinessException(GlobalConstantsEnum.DB_INSERT_RESULT_ERROR.getCode(), GlobalConstantsEnum.DB_INSERT_RESULT_ERROR.getMsg());
        }
        return 0;
    }
}

