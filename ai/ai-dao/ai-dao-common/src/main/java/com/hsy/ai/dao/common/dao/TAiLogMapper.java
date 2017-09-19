package com.hsy.ai.dao.common.dao;

import com.hsy.ai.bean.entity.TAiLog;
import com.hsy.ai.bean.entity.TAiLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAiLogMapper {
    long countByExample(TAiLogExample example);

    int deleteByExample(TAiLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(TAiLog record);

    int saveLog(TAiLog record);

    int insertSelective(TAiLog record);

    List<TAiLog> selectByExample(TAiLogExample example);

    TAiLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TAiLog record, @Param("example") TAiLogExample example);

    int updateByExample(@Param("record") TAiLog record, @Param("example") TAiLogExample example);

    int updateByPrimaryKeySelective(TAiLog record);

    int updateByPrimaryKey(TAiLog record);
}