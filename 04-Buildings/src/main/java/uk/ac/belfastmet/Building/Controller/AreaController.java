package uk.ac.belfastmet.Building.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.Building.Service.BuildingService;
@Controller
@RequestMapping("/Area/")
public class AreaController {
	
	@Autowired
	private BuildingService buildingService;
	
	@GetMapping("/")
	public String area(Model model) {

		
		model.addAttribute("pageTitle","Areas");
		this.buildingService = new BuildingService();
		model.addAttribute("areas",this.buildingService.getAreas());
		return "Areas";
		
		}
}