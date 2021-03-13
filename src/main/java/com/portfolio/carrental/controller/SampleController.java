package com.portfolio.carrental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/sample")
public class SampleController {

    @RequestMapping(value = "")
    public String sample() {
        return "/sample/sample";
    }

}