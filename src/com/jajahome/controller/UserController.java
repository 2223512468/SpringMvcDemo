package com.jajahome.controller;


import com.jajahome.po.User;
import com.jajahome.service.UserService;
import com.jajahome.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    private void userLogin(HttpServletRequest req, HttpServletResponse resp) {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = new User();
        user.setId(1);
        user.setUsername(username);
        user.setPassword(MD5.GetMD5Code(password));
        System.out.println(user.toString());
        userService.insert(user);
    }
}
