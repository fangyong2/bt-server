package com.csair.service.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.csair.mapper.TpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csair.model.Tp;
import com.csair.service.TpService;

@Service
public class TpServiceImpl implements TpService {
	@Autowired
	private TpMapper tpDao;

	@Override
	public Map<String,Object> selectByFy(Map<String, Object> param) {
		
		Map<String,Object> result = new HashMap<String,Object>();
		int total=tpDao.total(param);
		System.out.println(total);
		List<Tp> rows=tpDao.selectByFy(param);
		result.put("total",total);
		result.put("rows",rows);
		return result;
	}
}
