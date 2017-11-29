package uk.ac.belfastmet.dwarfs.controller;




import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
//import uk.ac.belfastmet.dwarfs.domain.Dwarf;

	@Controller
	@RequestMapping("/")
	public class DemoController {
	@GetMapping("/")
	public String disney(Model model) {
		model.addAttribute("pageTitle","Home Page");
		return "Homepage";
	}
	}


	
