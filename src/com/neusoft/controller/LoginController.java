package com.neusoft.controller;

import com.neusoft.domain.Dept;
import com.neusoft.mapper.DeptMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2018/11/26.
 */
@Controller
public class LoginController {
    SqlSession sqlSession = null;
    DeptMapper deptMapper = null;

//json字符串
    @RequestMapping("/login.do")
    public void login(HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("张三");
    }

    @RequestMapping("count/{num}")
    public String count(@PathVariable Integer num) throws IOException {
        System.out.println(num);
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
        //获得mapper接口对象
        deptMapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = deptMapper.getDeptByID(20);
        System.out.println(dept);
        return "world";
    }
    @RequestMapping("delete/{username}/{id}")
    public String delete(@PathVariable String username,@PathVariable Integer id)
    {
        System.out.println(username);
        System.out.println(id);
        return "world";
    }
}
