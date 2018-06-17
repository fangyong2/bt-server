package com.csair.mapper;

import com.csair.model.Tb;

import java.util.List;
import java.util.Map;

public interface TbMapper {

    int total(Map<String, Object> param);
    List<Tb> selectByFy(Map<String, Object> param);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb record);

    int insertSelective(Tb record);

    Tb selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tb record);

    int updateByPrimaryKey(Tb record);
}