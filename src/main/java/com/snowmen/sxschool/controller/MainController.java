package com.snowmen.sxschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author Snow
 * @create 2021-04-26 20:47
 */

@Controller
public class MainController {

    /**
     * 网站首页
     *
     * @return
     */
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    /**
     * 集团概况
     *
     * @return
     */
    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    /**
     * 成员单位
     *
     * @return
     */
    @RequestMapping("/department")
    public String department() {
        return "department";
    }

    /**
     * 政策文件
     *
     * @return
     */
    @RequestMapping("/policy")
    public String policy() {
        return "policy";
    }

    /**
     * 校企合作
     *
     * @return
     */
    @RequestMapping("/scc")
    public String scc() {
        return "scc";
    }

    /**
     * 校企合作
     *
     * @return
     */
    @RequestMapping("/science")
    public String science() {
        return "science";
    }
}
