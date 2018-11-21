package com.feiyu.api;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * TO DO :
 *
 * @author 睿动体育 | wangzhiqiang
 * @create 2018-11-21 11:22
 */
@Controller
@RequestMapping(value = "/testDemo")
public class TestDemo {
    @RequestMapping(value = "/testMethod")
    @ResponseBody
    public Map  testMethod(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("name","wangzhiqiang");
        return   map;
    }
}
