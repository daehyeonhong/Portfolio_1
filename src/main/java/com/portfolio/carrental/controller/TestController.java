package com.portfolio.carrental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.portfolio.carrental.service.TestService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/test")
public class TestController {

    private TestService testService;

    @RequestMapping(value = "/jsRender", method = RequestMethod.GET)
    public void jsRender() {
        log.info("jsRender");
    }

    @RequestMapping(value = "/yesNo/{yesNoId}", method = RequestMethod.GET)
    public String returnYesNo(@PathVariable("yesNoId") String yesNoId) {
        log.info(yesNoId);
        String yesNo = testService.validateYesNo(yesNoId);
        return yesNo;
    }

}