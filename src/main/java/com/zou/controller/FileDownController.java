package com.zou.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.IOException;

/**
 * @author: 邹祥发
 * @date: 2021/6/4 17:17
 * 文件下载
 */
@Controller
public class FileDownController {
    @RequestMapping("/download.do")
    public ResponseEntity<byte[]> download() throws IOException {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        //给要下载的文件起一个名字
        String downName = new String("redis6.mp4".getBytes("utf-8"), "iso8859-1");
        headers.setContentDispositionFormData("attachment", downName);
        System.out.println("下载的文件名：" + downName);
        //d盘中的redis.mp4是待下载的视频。这里讲待下载的视频放在d盘，也可以放在项目目录下
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(new File("D:\\15654\\alidownload\\redis.mp4")),
                headers, HttpStatus.CREATED);
    }
}