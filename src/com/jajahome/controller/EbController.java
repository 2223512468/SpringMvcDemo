package com.jajahome.controller;


import com.jajahome.po.EbBrand;
import com.jajahome.service.EbBrandService;
import com.jajahome.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/brand")
public class EbController {

    @Autowired
    private EbBrandService brandService;

    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    private void getBrandList(HttpServletRequest req, HttpServletResponse resp) {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        List<EbBrand> ebBrands = brandService.selectBrand();
        System.out.println(JsonData.createJsonString("data", ebBrands));
    }


}
