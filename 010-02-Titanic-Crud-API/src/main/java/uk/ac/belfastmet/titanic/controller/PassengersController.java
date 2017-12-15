package uk.ac.belfastmet.titanic.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.titanic.domain.Passenger;
import uk.ac.belfastmet.titanic.repositories.PassengersRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/passengers/")
public class PassengersController {

	@Autowired
	PassengersRepository passengersRepository;

	public PassengersController(PassengersRepository passengersRepository) {
		super();
		this.passengersRepository = passengersRepository;
	}

	@GetMapping("/")
	public String disney(Model model) {
		model.addAttribute("passengers", passengersRepository.findAll());
		return "passengerpage";
	}

	@GetMapping("/view/{passengerId}")
	public String viewPassenger(@PathVariable("passengerId") Integer passengerId, Model model) {

		model.addAttribute("passenger", passengersRepository.findOne(passengerId));

		return "viewPassenger";
	}

	@PostMapping("/save")
	public String savePassenger(@Valid Passenger passenger, BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {
			return "editPassenger";
		} else {
			Passenger savedPassenger = passengersRepository.save(passenger);

			return "redirect:/passengers/view/" + savedPassenger.getPassengerId();
		}

	}

	@GetMapping("/delete/{passengerId}")
	public String deletePassenger(@PathVariable("passengerId") Integer passengerId, RedirectAttributes redirectAttrs) {
		passengersRepository.delete(passengerId);
		redirectAttrs.addFlashAttribute("message", "Passenger was deleted");
		return "redirect:/passengers/";
	}

	@GetMapping("/add")
	public String createPassenger(Model model) {

		model.addAttribute("pageTitle", "Add Passenger");
		model.addAttribute("passenger", new Passenger());
		return "editPassenger";
	}

	@PostMapping("/search")
	public String search(@RequestParam("searchField") String searchField
			,@RequestParam("searchString") String searchString, Model model) {
		
		if (searchField.equals("name")){
			
			model.addAttribute("pageTitle","Search Passengers");
			model.addAttribute("passenger", passengersRepository.findByName(searchString));
			
		}else if(searchField.equals("embarked")) {
			
			model.addAttribute("pageTitle","Search Passengers");
			model.addAttribute("passenger", passengersRepository.findByEmbarked(searchString));
			
		}else if(searchField.equals("pclass")) {
			Integer pClass = Integer.parseInt(searchString);
			model.addAttribute("pageTitle","Search Passengers");
			model.addAttribute("passenger", passengersRepository.findByPclass(pClass));
		}
		
		return "passengerPage";
	}
}
