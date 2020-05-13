package com.whw.controller;

import com.whw.service.GuestService;
import com.whw.service.KindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/guest")
public class GuestController {
    @Autowired
    private GuestService guestService;
    @Autowired
    private KindService kindService;
    @GetMapping
    public String index(Model model){
        model.addAttribute("list",guestService.findAll());
        return "index";
    }
    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("list",kindService.findAll());
        return "list";
    }
}
