package com.csair.controller;

import com.alibaba.fastjson.JSONObject;
import com.csair.service.TpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/tp")
public class TpController {
    @Autowired
    private TpService tpService;

    @RequestMapping("/selectByFy")
    @ResponseBody
    public Object selectByFy(int pageSize, int pageNumber, String basestation) {
        if (0 == pageSize) pageSize = 10;
        if (0 == pageNumber) pageNumber = 1;

        Map<String, Object> param = new HashMap<String, Object>();
        int a = (pageNumber - 1) * pageSize;
        int b = pageSize;
        param.put("a", a);
        param.put("b", b);
        param.put("basestation", basestation);
        Map<String, Object> map = tpService.selectByFy(param);
        JSONObject responseObj = (JSONObject) JSONObject.toJSON(map);
        return responseObj;
    }
}
