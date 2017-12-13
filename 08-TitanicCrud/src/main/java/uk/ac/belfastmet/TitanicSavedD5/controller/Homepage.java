package uk.ac.belfastmet.TitanicSavedD5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.TitanicSavedD5.repositories.TitanicRepository;

@Controller
@RequestMapping("/")

public class Homepage {
	
	
	@Autowired
	TitanicRepository titanicRepository;

	public Homepage(TitanicRepository titanicRepository) {
		super();
		this.titanicRepository = titanicRepository;
	}
	
	
	
	
	
	@GetMapping("/")
	
	public String homepage(Model model) {
		model.addAttribute("pageTitle","HomePage");
		return "Homepage";
	}
	@GetMapping("/Passengers/")
	public String passengers(Model model) {
		model.addAttribute("pageTitle","Passengers");
		model.addAttribute("titanicpassengers",titanicRepository.findAll());
		return "Passengers";
	}	
	@GetMapping("/Surr/")
	public String survived(Model model) {
		model.addAttribute("pageTitle","Survived");
		model.addAttribute("titanicpassengers",titanicRepository.findBySurvived("1"));
		return "Passengers";
	}	
	@GetMapping("/Cabin/")
	public String Cabin(Model model) {
		model.addAttribute("pageTitle","Survived");
		model.addAttribute("titanicpassengers",titanicRepository.findByAndCabinIsNotNull());
		return "Passengers";
	}
}