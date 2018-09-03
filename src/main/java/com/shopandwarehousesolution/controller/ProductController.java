package com.shopandwarehousesolution.controller;

import com.shopandwarehousesolution.entity.Product;
import com.shopandwarehousesolution.entity.WareHouse;
import com.shopandwarehousesolution.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("/registerproduct")
    public String save(
            @RequestParam String name,
            @RequestParam long barcode,
            @RequestParam String artykul,
            @RequestParam float price) {

        Product product = new Product();
        product.setName(name);
        product.setBarcode(barcode);
        product.setArtykul(artykul);
        product.setPrice(price);
        product.setDate(new Date());
        productService.save(product);

        return "/admin";
    }
}
