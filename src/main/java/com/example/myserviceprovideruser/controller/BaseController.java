package com.example.myserviceprovideruser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/base")
public class BaseController {

    @RequestMapping(value ="/list")
    public String list(){
        System.out.println("访问开始");
        return "helloword";
    }

    @ResponseBody
    @RequestMapping(value = "/info")
    public String  info(){
        return "show me the answer";
    }

}
