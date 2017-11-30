package uk.ac.belfastmet.Building.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.Building.Service.BuildingService;

@Controller
@RequestMapping("/")


public class HomePageController {
	@GetMapping("/")
	public String homepage(Model model) {

		
		model.addAttribute("pageTitle","Volume");
		return "Homepage";
	}
}
