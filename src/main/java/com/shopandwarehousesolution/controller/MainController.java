package com.shopandwarehousesolution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

/**
 * Created by Sergiy Ageev on 01.09.2018.
 */
@Controller
public class MainController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/admin")
    public String admin(Principal principal, Model model) {
        model.addAttribute("principal", principal);
        return "/admin";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }


    @GetMapping("/logout")
    public String logout() {
        return "redirect:/index";
    }

    @GetMapping("/register")
    public String register() {
        return "/registerPage";
    }
    @GetMapping("/registernewshop")
    public String registernewshop(){
        return "/registerShopPage";
    }
    @GetMapping("/registernewwarehouse")
    public String registernewwarehouse(){
        return "/registerWarehousePage";
    }
    @GetMapping("/registernewproduct")
    public String registerproduct(){
        return "/registerProductPage";
    }

}
