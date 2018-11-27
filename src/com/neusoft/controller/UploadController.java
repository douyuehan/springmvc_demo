package com.neusoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Administrator on 2018/11/27.
 */
@Controller
public class UploadController {
    @RequestMapping("/upload")
    public ModelAndView upload(String username, @RequestParam MultipartFile upload_pic, HttpServletRequest request) throws IOException {
        System.out.println(username);
        ModelAndView modelAndView = new ModelAndView();
        if(upload_pic.getSize() > 0)
        {
            String fileName = upload_pic.getOriginalFilename();

//        域对象 page request session application
            //我站点（项目）所在的系统的路径
            String realPath = request.getServletContext().getRealPath("/static/upload")+ File.separator;
            File folder = new File(realPath);

            if(!folder.exists())
            {
                folder.mkdirs();
            }


            System.out.println(realPath);

            System.out.println(fileName);
//            Date date = new Date();
//            long time = date.getTime();//此刻的时间距离19700101经过的毫秒数
            UUID uuid = UUID.randomUUID();
            File savePath = new File(realPath  + uuid + fileName);
            upload_pic.transferTo(savePath);

            modelAndView.addObject("picname",fileName);
            modelAndView.setViewName("index");
        }


        return modelAndView;

    }
}
