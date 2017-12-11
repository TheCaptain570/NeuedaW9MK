package uk.ac.belfastmet.Forms1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "01-forms";
	}
	
	@PostMapping("/result")
	public String results(
			@RequestParam("firstname") String firstName,
			@RequestParam("lastname")String lastName, 
			@RequestParam("gender")String gender,
			Model model) {
		model.addAttribute("firstname",firstName);
		model.addAttribute("lastname",lastName);
		model.addAttribute("gender",gender);
		return "02-result";
	}
	@GetMapping("/result")
	public String resul(Model model) {
		model.addAttribute("firstname","Chuck");
		model.addAttribute("lastname","Norris");
		model.addAttribute("gender","Unknown");
		return "02-result";
	}
}
