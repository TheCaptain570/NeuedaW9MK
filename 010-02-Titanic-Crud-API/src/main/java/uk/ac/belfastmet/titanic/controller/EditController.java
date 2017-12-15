package uk.ac.belfastmet.titanic.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



import uk.ac.belfastmet.titanic.repositories.PassengersRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/passengers/")
public class EditController {
	

	@Autowired
	PassengersRepository passengersRepository;
	

	public EditController(PassengersRepository passengersRepository) {
		super();
		this.passengersRepository = passengersRepository;
	}



	@GetMapping("/edit/{passengerId}")
	public String editCereal(@PathVariable("passengerId") Integer passengerId, Model model)
	{
		model.addAttribute("passenger",passengersRepository.findOne(passengerId));
		return "editPassenger";
	}

}
