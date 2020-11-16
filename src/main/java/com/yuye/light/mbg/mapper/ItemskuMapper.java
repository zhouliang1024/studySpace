package com.yuye.light.mbg.mapper;

import com.yuye.light.mbg.model.Itemsku;
import com.yuye.light.mbg.model.ItemskuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemskuMapper {
    int countByExample(ItemskuExample example);

    int deleteByExample(ItemskuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Itemsku record);

    int insertSelective(Itemsku record);

    List<Itemsku> selectByExampleWithBLOBs(ItemskuExample example);

    List<Itemsku> selectByExample(ItemskuExample example);

    Itemsku selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Itemsku record, @Param("example") ItemskuExample example);

    int updateByExampleWithBLOBs(@Param("record") Itemsku record, @Param("example") ItemskuExample example);

    int updateByExample(@Param("record") Itemsku record, @Param("example") ItemskuExample example);

    int updateByPrimaryKeySelective(Itemsku record);

    int updateByPrimaryKeyWithBLOBs(Itemsku record);

    int updateByPrimaryKey(Itemsku record);
}