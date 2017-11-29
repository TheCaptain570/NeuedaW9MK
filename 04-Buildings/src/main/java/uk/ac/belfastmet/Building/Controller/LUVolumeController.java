package uk.ac.belfastmet.Building.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



public class LUVolumeController {
	
	
	@Autowired
	//private DwarfService dwarfService;
	
	@GetMapping("/")
	public String disney(Model model) {

		
		model.addAttribute("pageTitle","Disney");
		//.dwarfService = new DwarfService();
		//model.addAttribute("dwarfs",this.dwarfService.getDisneyDwarfs());
		return "DisneyPage";
		
		}
}
