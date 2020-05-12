package com.whw.controller;

import com.whw.service.UsreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UsreService service ;

    @GetMapping
    public String test(Model model){
        model.addAttribute("list",service.findAll());
        return "list";
    }
}
