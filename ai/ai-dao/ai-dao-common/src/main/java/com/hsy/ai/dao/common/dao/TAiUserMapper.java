package com.hsy.ai.dao.common.dao;

import com.hsy.ai.bean.entity.TAiUser;
import com.hsy.ai.bean.entity.TAiUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAiUserMapper {
    /**
     * @description <p>保存记录</p>
     * @param record 待保存的实体
     * @return 成功插入条数
     * @author heshiyuan
     * @date 20/09/2017 2:17 PM
     * @email shiyuan4work@sina.com
     * @github https://github.com/shiyuan2he.git
     * Copyright (c) 2016 shiyuan4work@sina.com All rights reserved
     */
    int insert(TAiUser record);
    /**
     * @description <p>根据参数计算数量</p>
     * @param record 记录
     * @return 计算某一id的数量
     * @author heshiyuan
     * @date 20/09/2017 2:17 PM
     * @email shiyuan4work@sina.com
     * @github https://github.com/shiyuan2he.git
     * Copyright (c) 2016 shiyuan4work@sina.com All rights reserved
     */
    long countByParam(TAiUser record) ;
}