package com.xiaobai.scheduled.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
   //只要能进这个页面，代表服务运行正常
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("title","主页标题");
        model.addAttribute("content","主页内容");
        return "swing";
    }
}
