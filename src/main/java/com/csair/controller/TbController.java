package com.csair.controller;

import com.alibaba.fastjson.JSONObject;
import com.csair.service.TbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/tb")
public class TbController {
    @Autowired
    private TbService tbService;

    @RequestMapping("/selectByFy")
    @ResponseBody
    public Object selectByFy(int pageSize, int pageNumber, String phonecode,String startime,String endtime) {
        if (0 == pageSize) pageSize = 10;
        if (0 == pageNumber) pageNumber = 1;

        Map<String, Object> param = new HashMap<String, Object>();
        int a = (pageNumber - 1) * pageSize;
        int b = pageSize;
        param.put("a", a);
        param.put("b", b);
        param.put("phonecode", phonecode);
        param.put("startime", startime);
        param.put("endtime", endtime);
        Map<String, Object> map = tbService.selectByFy(param);
        JSONObject responseObj = (JSONObject) JSONObject.toJSON(map);
        return responseObj;
    }
}
