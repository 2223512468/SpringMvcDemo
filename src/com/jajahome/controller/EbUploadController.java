package com.jajahome.controller;


import org.apache.commons.fileupload.FileUploadException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/upload")
public class EbUploadController {

    @RequestMapping(value = "/image", method = {RequestMethod.POST})
    public void uploadPic(HttpServletRequest req, HttpServletResponse resp) throws IOException, FileUploadException {

        String name = req.getParameter("name");
        String image_desc = req.getParameter("image_desc");

        System.out.println("name" + name);
        System.out.println("--" + image_desc);
    }


    @RequestMapping(value = "/json", method = {RequestMethod.POST})
    public void getJson(HttpServletRequest req, HttpServletResponse resp) {
        String json = req.getParameter("json");
        System.out.println("json" + json);
    }

}
