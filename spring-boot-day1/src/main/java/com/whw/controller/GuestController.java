package com.whw.controller;

import com.whw.bean.Guest;
import com.whw.service.GuestService;
import com.whw.service.Guservice;
import com.whw.service.Gusss;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService service;
    @Autowired
    private Gusss gg;

    @GetMapping
    public String index(Model model){
        List<Guest> list = gg.list();
        model.addAttribute("list",list);
        return "index";
    }
}
