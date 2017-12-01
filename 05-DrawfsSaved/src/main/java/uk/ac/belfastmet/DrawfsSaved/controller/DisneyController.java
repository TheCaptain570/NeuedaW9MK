package uk.ac.belfastmet.DrawfsSaved.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.DrawfsSaved.repositories.DwarfRepository;

//import uk.ac.belfastmet.dwarfs.domain.Dwarf;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/Disney/")
public class DisneyController {
	
	@Autowired
	DwarfRepository dwarfRepository;

	public DisneyController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}

	@GetMapping("/")
	
	public String disney(Model model) 
	{
		model.addAttribute("pageTitle","Disney");
		model.addAttribute("dwarfs",dwarfRepository.findByAuthor("Disney"));
		return "DisneyPage";
	}

}
