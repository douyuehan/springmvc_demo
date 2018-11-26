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
    public void hello()
    {
        System.out.println("hello");
    }
    @RequestMapping("world.do")
    public void world()
    {
        System.out.println("world");
    }
}
