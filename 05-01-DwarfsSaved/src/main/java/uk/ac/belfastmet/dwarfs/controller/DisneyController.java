package uk.ac.belfastmet.dwarfs.controller;

//import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

//import uk.ac.belfastmet.dwarfs.domain.Dwarf;
import uk.ac.belfastmet.dwarfs.repositories.DwarfRepository;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/disney/")
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
		model.addAttribute("pageTitle","Disney");;
		model.addAttribute("dwarfs",dwarfRepository.findAll());
		return "disneyPage";
	}

}
