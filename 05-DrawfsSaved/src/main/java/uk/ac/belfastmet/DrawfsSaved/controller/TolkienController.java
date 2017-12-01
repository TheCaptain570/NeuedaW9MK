package uk.ac.belfastmet.DrawfsSaved.controller;

//import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.DrawfsSaved.repositories.DwarfRepository;

//import org.springframework.ui.Model;


@Controller
@RequestMapping("/Tolk")

public class TolkienController {
	
	@Autowired
	DwarfRepository dwarfRepository;

	public TolkienController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}
	
	@GetMapping("/")
	public String tolkien(Model model) {
		model.addAttribute("pageTitle","Tolkien");
		model.addAttribute("dwarfs",dwarfRepository.findByAuthor("Tolkien"));
		return "TolkienPage";
		
		}
}