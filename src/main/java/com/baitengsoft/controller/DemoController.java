package com.baitengsoft.controller;

import com.baitengsoft.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2018/3/11.
 */
@Controller
@RequestMapping(value = "/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/hello")
    public String index(HttpServletRequest request) {

        String str = demoService.sayHello("Jack");
        System.out.println(str);
        return "success";

    }
}
