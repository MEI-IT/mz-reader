package com.mz.reader.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {
    @RequestMapping("/test/t1")
    public ModelAndView test1() {
        return new ModelAndView("test");
    }

    @RequestMapping("/test/t2")
    @ResponseBody
    public Map test2() {
        Map result = new HashMap();
        result.put("test", "测试文本");
        return result;
    }
}
