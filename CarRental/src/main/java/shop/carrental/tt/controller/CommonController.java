package shop.carrental.tt.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping(value = "/common/*")
public class CommonController {

	@GetMapping(value = "/error/accessError")
	public void accessDenied(Authentication auth, Model model) {
		log.info("Access Denied ==> " + auth);

		model.addAttribute("msg", "Access Denied");
	}

}