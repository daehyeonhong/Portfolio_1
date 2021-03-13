package com.portfolio.carrental.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/secure")
public class SecureController {

    @GetMapping(value = "/all")
    public void all() {
        log.info("All Can Access Everybody");
    }

    @GetMapping(value = "/notice")
    public void notice() {
        log.info("Notice");
    }

    @GetMapping(value = "/member")
    @PreAuthorize("isAuthenticated()")
    public void member() {
        log.info("Logined Member");
    }

    @GetMapping(value = "/admin")
    public void admin() {
        log.info("Admin Only");
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_MEMBER')")
    @GetMapping("/annoMemer")
    public void member2() {
        log.info("Logined Annotation Member");
    }

    @Secured({ "ROLE_ADMIN" })
    @GetMapping("/annoAdmin")
    public void admin2() {
        log.info("Admin Annotation Only");
    }

}