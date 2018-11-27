package com.neusoft.controller;

import com.neusoft.dto.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2018/11/26.
 */
///hello.do
@Controller
public class HelloController {

    @RequestMapping("hello.do")
    public ModelAndView hello(User user) {


        System.out.println(user.getUser_age());
        ModelAndView modelAndView = new ModelAndView();
        //把view（jsp）的名字，设置到modelAndView中
        modelAndView.setViewName("hello");
//        //设置要传递给jsp的数据
        modelAndView.addObject("userinfo",user);
        return modelAndView;

    }
    @RequestMapping("/world.do")
    public void world(Model model, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("world");
//        model.addAttribute("username","lisi");
        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("username","wangwu");
        response.sendRedirect("/world2.do");
//        return "redirect:/world2.do";
    }

    @RequestMapping("/world")
    public void world2(HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("张三");
    }


}
