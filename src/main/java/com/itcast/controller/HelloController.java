package com.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class HelloController {

    @RequestMapping("/hello")
    public String HelloWorld(HttpServletRequest request, HttpServletResponse response){
        System.out.println("hello,springMVC");
        System.out.println(request);
        System.out.println(response);
        request.getSession().getServletContext();
        return "success";
    }
    @RequestMapping("/requestMapping")
    public String testRequestMapping(){
        System.out.println("testRequestMapping");
        return "success";
    }
}
