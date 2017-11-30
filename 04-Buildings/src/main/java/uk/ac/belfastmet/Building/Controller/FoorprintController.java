package uk.ac.belfastmet.Building.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.Building.Service.BuildingService;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/Footprint/")
public class FoorprintController {

	
	@Autowired
	private BuildingService buildingService;
	
	@GetMapping("/")
	public String footprint(Model model) {

		
		model.addAttribute("pageTitle","FootPrint");
		this.buildingService = new BuildingService();
		model.addAttribute("footprint",this.buildingService.getFootPrint());
		return "footprintPage";
		
		}
}


