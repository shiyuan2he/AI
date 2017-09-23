package com.hsy.ai.dao.chat.dao;

import com.hsy.ai.bean.entity.TAiChatSinogram;
import com.hsy.ai.bean.entity.TAiChatSinogramExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAiChatSinogramMapper {
    long countByExample(TAiChatSinogramExample example);

    int deleteByExample(TAiChatSinogramExample example);

    int deleteByPrimaryKey(String id);

    int insert(TAiChatSinogram record);

    int insertSelective(TAiChatSinogram record);

    List<TAiChatSinogram> selectByExample(TAiChatSinogramExample example);

    TAiChatSinogram selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TAiChatSinogram record, @Param("example") TAiChatSinogramExample example);

    int updateByExample(@Param("record") TAiChatSinogram record, @Param("example") TAiChatSinogramExample example);

    int updateByPrimaryKeySelective(TAiChatSinogram record);

    int updateByPrimaryKey(TAiChatSinogram record);
}