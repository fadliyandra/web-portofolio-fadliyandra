package com.dibimbing1.dibimbing.controller;

import com.dibimbing1.dibimbing.model.TestBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/v1/praktek")
 class TestBeansController {
    @Autowired //depedenci injection
    TestBeans testBeans;



    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return testBeans.appSaya();
    }
}
