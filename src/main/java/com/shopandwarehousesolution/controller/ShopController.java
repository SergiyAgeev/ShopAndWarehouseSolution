package com.shopandwarehousesolution.controller;

import com.shopandwarehousesolution.entity.Shop;
import com.shopandwarehousesolution.entity.WareHouse;
import com.shopandwarehousesolution.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ShopController {

    @Autowired
    ShopService shopService;
    @PostMapping("/registershop")
    public String save(
            @RequestParam String city,
            @RequestParam String adress,
            @RequestParam int phoneNumberOfShop,
            @RequestParam String director,
            @RequestParam int numberOfWorkers) {
    Shop shop = new Shop();
    shop.setCity(city);
    shop.setAdress(adress);
    shop.setPhoneNumberOfShop(phoneNumberOfShop);
    shop.setDirector(director);
    shop.setNumberOfWorkers(numberOfWorkers);
    shopService.save(shop);

        return "/admin";
    }
    @GetMapping("/showallshops")
    public String showAllUsers(Model model) {
        List<Shop> shop = shopService.findAll();
        model.addAttribute("ShopX", shopService.findAll());
        return "ShopListPage";
    }
}
