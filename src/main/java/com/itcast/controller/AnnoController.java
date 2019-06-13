package com.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AnnoController {

    @RequestMapping("testRequestParam")
    public String testRequestParam(@RequestParam(name="uname") String username){

        System.out.println(username);

        System.out.println("执行了...");
        return "success";
    }
}
