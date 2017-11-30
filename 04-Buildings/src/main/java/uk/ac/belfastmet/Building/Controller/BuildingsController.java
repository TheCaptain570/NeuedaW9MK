package uk.ac.belfastmet.Building.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.Building.Service.BuildingService;

@Controller
@RequestMapping("/")


public class BuildingsController {

	


		@Autowired
		private BuildingService buildingService;
		
		
		@GetMapping("/")
		public String homepage(Model model) {
			
			model.addAttribute("pageTitle","Volume");
			return "Homepage";
		}
	
	@GetMapping("/Footprint/")
	public String footprint(Model model) {

		
		model.addAttribute("pageTitle","Footprint");
		this.buildingService = new BuildingService();
		model.addAttribute("footprint",this.buildingService.getFootPrint());
		return "footprintPage";
	
		}
	
	@GetMapping("/Area/")
	public String area(Model model) {

		
		model.addAttribute("pageTitle","Area");
		this.buildingService = new BuildingService();
		model.addAttribute("areas",this.buildingService.getAreas());
		return "Areas";
		
		}
	@GetMapping("/Volume/")
	public String volume(Model model) {

		
		model.addAttribute("pageTitle","Volume");
		this.buildingService = new BuildingService();
		model.addAttribute("volume",this.buildingService.getVolume());
		return "Volume";
		
		}	

	
}

