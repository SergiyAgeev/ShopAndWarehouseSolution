package com.shopandwarehousesolution.controller;

import com.shopandwarehousesolution.entity.Shop;
import com.shopandwarehousesolution.entity.User;
import com.shopandwarehousesolution.entity.WareHouse;
import com.shopandwarehousesolution.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class WarehouseController {

    @Autowired
    WarehouseService warehouseService;

    @PostMapping("/registerwarehouse")
    public String save(
            @RequestParam String city,
            @RequestParam String adress,
            @RequestParam int phoneNumberOfWarehouse,
            @RequestParam String director,
            @RequestParam int numberOfWorkers) {
        WareHouse wareHouse = new WareHouse();
        wareHouse.setSity(city);
        wareHouse.setAdress(adress);
        wareHouse.setPhoneNumberOfWarehouse(phoneNumberOfWarehouse);
        wareHouse.setDirector(director);
        wareHouse.setNumberOfWorkers(numberOfWorkers);
        warehouseService.save(wareHouse);

        return "/admin";
    }
    @GetMapping("/showallwarehouses")
    public String showAllUsers(Model model) {
        List<WareHouse> warehouse = warehouseService.findAll();
        model.addAttribute("WarehouseX", warehouseService.findAll());
        return "WarehouseListPage";
    }
}
