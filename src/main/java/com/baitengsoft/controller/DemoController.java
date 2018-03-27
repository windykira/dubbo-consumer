package com.baitengsoft.controller;

import com.baiten.DemoService;
import com.result.ReturnResult;
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

        ReturnResult returnValue;
        try {
            returnValue = demoService.speak("Jack");
            String str = "";
        }catch (Exception e){
            String str = "";
            e.printStackTrace();
        }
        return "success";

    }
}
