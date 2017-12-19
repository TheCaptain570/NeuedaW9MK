package uk.ac.belfastmet.Formsevents.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import uk.ac.belfastmet.Formsevents.domain.Allevents;


@Controller
@RequestMapping("/")
public class homepageController {
	
	public homepageController() {}	
	
	@GetMapping("/")
	public String home(Model model){
		model.addAttribute("pageTitle","Weather");
		return "homePage";
	}
	
	@GetMapping("/event")
	public String event(Model model){
		model.addAttribute("pageTitle","Weather");	
		
		String belfastEventURL=  "https://neueda-flask-bndouglas.c9users.io/belfast-events/api/";	
		
		RestTemplate restTemplate = new RestTemplate();
		Allevents allevents = restTemplate.getForObject(belfastEventURL, Allevents.class);

		model.addAttribute("events",allevents.getAllEvents());
		return "event";
	}
		
}
