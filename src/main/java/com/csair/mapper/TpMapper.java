package com.csair.mapper;

import com.csair.model.Tp;
import java.util.List;
import java.util.Map;

public interface TpMapper {

    int total(Map<String, Object> param);
    List<Tp> selectByFy(Map<String, Object> param);

    int deleteByPrimaryKey(Integer id);

    int insert(Tp record);

    int insertSelective(Tp record);

    Tp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tp record);

    int updateByPrimaryKey(Tp record);
}