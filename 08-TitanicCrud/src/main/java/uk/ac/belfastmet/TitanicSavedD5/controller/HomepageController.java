package uk.ac.belfastmet.TitanicSavedD5.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

//import uk.ac.belfastmet.FormsCereal.domain.Cereals;
import uk.ac.belfastmet.TitanicSavedD5.domain.Passenger;
import uk.ac.belfastmet.TitanicSavedD5.repositories.TitanicRepository;

@Controller
@RequestMapping("/")

public class HomepageController {
	
	
	@Autowired
	TitanicRepository titanicRepository;

	public HomepageController(TitanicRepository titanicRepository) {
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
		model.addAttribute("pageTitle","Passenger");
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
	@GetMapping("/view/{passengerid}")
	public String view(@PathVariable("passengerid") Integer passengerid, Model model) {
		model.addAttribute("pageTitle","View Passenger");
		model.addAttribute("titanicpassengers",titanicRepository.findOne(passengerid));
		return "View";
	}
	
	@GetMapping("/add/")
	public String add(Model model) {
		model.addAttribute("pageTitle","Add Passenger");
		model.addAttribute("passenger",new Passenger());
		return "Add";
	}
	@PostMapping("/save/")
	public String save(@Valid Passenger pass, BindingResult bindingResult, Model model) {
		
		if(bindingResult.hasErrors()) {
			return "Add";
		}
		else {
			Passenger savedPass = titanicRepository.save(pass);
		return "redirect:/view/" + savedPass.getPassengerId();}
	}
	@GetMapping("/edit/{passengerid}")
	public String edit(@PathVariable("passengerid") Integer passengerid,Model model) {
		model.addAttribute("pageTitle","Edit Cereal");
		model.addAttribute("passenger",titanicRepository.findOne(passengerid));
		return "edit";
	}
	@GetMapping("/delete/{Passengerid}")
	public String delete(@PathVariable("Passengerid") Integer passengerid, 
			RedirectAttributes redirectAttrs ) {
		redirectAttrs.addFlashAttribute("message", "Passenger was deleted");
		titanicRepository.delete(passengerid);
		return "redirect:/";
	}
}