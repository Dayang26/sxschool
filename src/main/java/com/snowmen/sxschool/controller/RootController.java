package com.snowmen.sxschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Snow
 * @create 2021-04-27 11:25
 */
@Controller
public class RootController {

    /**
     * 管理员界面
     * @return
     */
    @RequestMapping("/managerPage")
    public String managerPage() {
        return "managerPage";
    }
}
