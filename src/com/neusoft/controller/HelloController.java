package com.neusoft.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/11/26.
 */
///hello.do
@Controller
public class HelloController {

    @RequestMapping("hello.do")
    public String hello()
    {
        System.out.println("hello");
        return "hello";
    }
    @RequestMapping("world.do")
    public String world()
    {
        System.out.println("world");
        return "world";
    }
}
