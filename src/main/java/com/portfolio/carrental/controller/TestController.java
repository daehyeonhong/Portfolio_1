package com.portfolio.carrental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/test")
public class TestController {

	@RequestMapping(value = "/jsRender", method = RequestMethod.GET)
	public void jsRender() {
		log.info("jsRender");
	}

}
