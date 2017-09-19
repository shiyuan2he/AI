package com.hsy.ai.dao.common.dao;

import com.hsy.ai.bean.entity.TAiUser;
import com.hsy.ai.bean.entity.TAiUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAiUserMapper {
    long countByExample(TAiUserExample example);

    int deleteByExample(TAiUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(TAiUser record);

    int insertSelective(TAiUser record);

    List<TAiUser> selectByExample(TAiUserExample example);

    TAiUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TAiUser record, @Param("example") TAiUserExample example);

    int updateByExample(@Param("record") TAiUser record, @Param("example") TAiUserExample example);

    int updateByPrimaryKeySelective(TAiUser record);

    int updateByPrimaryKey(TAiUser record);
}