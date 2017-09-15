package com.hsy.ai.dao.log;

import com.hsy.ai.bean.entity.TAiLog;
import com.hsy.ai.bean.entity.TAiLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TAiLogMapper {
    long countByExample(TAiLogExample example);

    int deleteByExample(TAiLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TAiLog record);

    int insertSelective(TAiLog record);

    List<TAiLog> selectByExample(TAiLogExample example);

    TAiLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TAiLog record, @Param("example") TAiLogExample example);

    int updateByExample(@Param("record") TAiLog record, @Param("example") TAiLogExample example);

    int updateByPrimaryKeySelective(TAiLog record);

    int updateByPrimaryKey(TAiLog record);
}