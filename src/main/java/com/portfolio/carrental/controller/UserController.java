package com.portfolio.carrental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import com.portfolio.carrental.domain.UserVO;
import com.portfolio.carrental.service.UserService;

@Log4j
@Controller
@AllArgsConstructor
@RequestMapping(value = "/user/*")
public class UserController {

    private UserService userService;

    @GetMapping(value = "/login")
    public void loginInput(String error, String logout, Model model) {
        log.info("error ==> " + error);
        log.info("logout ==> " + logout);

        if (error != null) {
            model.addAttribute("error", "Login Error Check Your Account");
        }

        if (logout != null) {
            model.addAttribute("logout", "Logout!!");
        }
    }

    @GetMapping(value = "/logout")
    public void logoutGET() {
        log.info("Logout");
    }

    @GetMapping(value = "/register")
    public void register() {
        log.info("Register");
    }

    @PostMapping(value = "/register")
    public String registers(UserVO userVO) {
        log.info("Registers");
        userService.register(userVO);
        return "redirect:/user/login";
    }

}