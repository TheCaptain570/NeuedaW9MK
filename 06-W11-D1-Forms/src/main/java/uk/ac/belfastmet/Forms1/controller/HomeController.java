package uk.ac.belfastmet.Forms1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

	@GetMapping("/")
	public String home(Model model) {
		return "01-forms.html";
	}
	
	@GetMapping("/result")
	public String results(Model model) {
		return "02-result.html";
	}

}
