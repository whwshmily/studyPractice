package com.whw.controller;

import com.whw.servcie.BaseGuestService;
import com.whw.servcie.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/guest")
public class GuestController {
    @Autowired
    private GuestService sservice;
    @Autowired
    private BaseGuestService service;
    @GetMapping
    public String index(Model model){
        model.addAttribute("list",sservice.findAll());
        return "index";
    }
}
