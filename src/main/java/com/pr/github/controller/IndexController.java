package com.pr.github.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("pageTitle", "첫 페이지");
        model.addAttribute("user", "사용자");
        return "index";
    }
}
