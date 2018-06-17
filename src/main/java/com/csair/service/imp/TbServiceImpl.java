package com.csair.service.imp;

import com.csair.mapper.TbMapper;
import com.csair.model.Tb;
import com.csair.service.TbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TbServiceImpl implements TbService {
	@Autowired
	private TbMapper tbDao;

	@Override
	public Map<String,Object> selectByFy(Map<String, Object> param) {
		
		Map<String,Object> result = new HashMap<String,Object>();
		int total=tbDao.total(param);

		List<Tb> rows=tbDao.selectByFy(param);
		result.put("total",total);
		result.put("rows",rows);
		return result;
	}
}
