package com.itcast.controller;

import com.itcast.domain.Account;
import com.itcast.domain.User.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/params")
public class ParamsController {
    /**
     * 封装单个属性
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/testParams")
    public String testPramas(String username,String password){
        System.out.println("username: "+username);
        System.out.println("password: "+password);
        return "success";
    }

    /**
     * 封装javaBean
     * @param account
     * @return
     */
    @RequestMapping("/testBean")
    public String testBean(Account account){

        System.out.println(account);

        return "success";
    }

    /**
     * 自定义类型转换器
     * @param u
     * @return
     */
    @RequestMapping("/testDate")
    public String testDate(User u){

        System.out.println(u);

        return "success";
    }
}
