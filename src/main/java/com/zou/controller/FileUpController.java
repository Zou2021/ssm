package com.zou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author: 邹祥发
 * @date: 2021/6/4 14:51
 * 文件上传
 */
@Controller
@RequestMapping("/upload")
public class FileUpController {

    @RequestMapping("/singleFileUpload.do")
    public String singleFileUpload(MultipartFile files) throws IOException {

        String path = "d:/img/";

        if (files != null) {
            String path2 = files.getOriginalFilename();
            assert path2 != null;
            String suffix = path2.substring(path2.lastIndexOf("."));
            System.out.println("文件的类型："+suffix);
            String upPath = path + path2;
            files.transferTo(new File(upPath));
            System.out.println("文件保存的路径："+upPath);
            System.out.println("-----------");
            return "success";

        } else {
            return "error";
        }
    }

    @RequestMapping("/MoreFileUpload.do")
    public String MoreFileUpload(@RequestParam("files")
                                         MultipartFile[] files) throws IOException {
        String path = "d:/img/";
        if (files != null) {
            for (MultipartFile file : files) {
                String path2 = file.getOriginalFilename();
                System.out.println("文件名："+path2);
                String upPath = path + path2;
                file.transferTo(new File(upPath));
                System.out.println("文件保存的路径："+upPath);
                System.out.println("-----------");
            }
            return "success";
        } else {
            return "error";
        }
    }
}