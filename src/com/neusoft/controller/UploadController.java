package com.neusoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2018/11/27.
 */
@Controller
public class UploadController {
    @RequestMapping("/upload")
    public void upload(String username,@RequestParam MultipartFile upload_pic) throws IOException {
        System.out.println(username);
        String fileName = upload_pic.getOriginalFilename();
        System.out.println(fileName);
        File savePath = new File("d:/" + fileName);
        upload_pic.transferTo(savePath);
    }
}
