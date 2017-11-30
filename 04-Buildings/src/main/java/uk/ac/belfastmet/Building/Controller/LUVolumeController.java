package uk.ac.belfastmet.Building.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.Building.Service.BuildingService;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/Volume/")
public class LUVolumeController {

	
	@Autowired
	private BuildingService buildingService;
	
	@GetMapping("/")
	public String volume(Model model) {

		
		model.addAttribute("pageTitle","Volume");
		this.buildingService = new BuildingService();
		model.addAttribute("volume",this.buildingService.getVolume());
		return "Volume";
		
		}
}
