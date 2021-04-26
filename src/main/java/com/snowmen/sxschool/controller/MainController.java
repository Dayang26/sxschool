package com.snowmen.sxschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Snow
 * @create 2021-04-26 20:47
 */
@Controller()
public class MainController {

    /**
     * 网站首页
     * @return
     */
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    /**
     * 集团概况
     * @return
     */
    @RequestMapping("/about")
    public String about(){
        return "about";
    }

    @RequestMapping("/department")
    public String department(){
        return "department";
    }
}
