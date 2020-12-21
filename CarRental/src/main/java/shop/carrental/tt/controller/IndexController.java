package shop.carrental.tt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class IndexController {

	@GetMapping(value = "/")
	public String index() {
		log.info("index");

		return "/index";
	}
	@GetMapping(value = "/login")
	public String login() {
		log.info("login");

		return "/login";
	}

}