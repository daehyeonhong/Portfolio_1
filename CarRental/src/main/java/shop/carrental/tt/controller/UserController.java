package shop.carrental.tt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping(value = "/user/*")
public class UserController {

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
	public String registers() {

		log.info("Registers");

		return "redirect:/user/login";
	}

}