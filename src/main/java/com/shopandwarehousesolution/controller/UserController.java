package com.shopandwarehousesolution.controller;

import com.shopandwarehousesolution.entity.User;
import com.shopandwarehousesolution.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.security.Principal;
import java.util.List;

/**
 * Created by Sergiy Ageev on 01.09.2018.
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/save")
    public String save(@RequestParam("username") String username,
                       @RequestParam("password") String password,
                       @RequestParam("email") String email,
                       @RequestParam("name") String name,
                       @RequestParam("surname") String surname,
                       @RequestParam("age") short age,
                       @RequestParam("passportSerie") String passportSerie,
                       @RequestParam("passportNumber") int passportNumber,
                       @RequestParam("ShopId") int ShopId,
                       @RequestParam("WareHouseId") int WareHouseId,
                       @RequestParam("avatar") MultipartFile avatar) {


        String path = System.getProperty("user.home") + File.separator + "Multipart\\";
        try {
            avatar.transferTo(new File(path + avatar.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setShopId(ShopId);
        user.setWareHouseId(WareHouseId);
        user.setName(name);
        user.setSurname(surname);
        user.setAge(age);
        user.setPassportSerie(passportSerie);
        user.setPassportNumber(passportNumber);
        user.setAvatar("\\userAvatar\\" + avatar.getOriginalFilename());
        userService.save(user);
//        mailService.send(user);


        return "/index";

    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id) {
        userService.delete(id);
        return "/adminpage";
    }

    @RequestMapping("/user")
    public String editUser(Principal principal,
                           Model uiModel) {
        User user = userService.findByUserName(principal.getName());
        uiModel.addAttribute("user", user);
        return "userPage";
    }

    @GetMapping("/showallusers")
    public String showAllUsers(Model model) {
        List<User> user = userService.findAll();
        model.addAttribute("UserX", userService.findAll());
        return "userListPage";
    }
}
