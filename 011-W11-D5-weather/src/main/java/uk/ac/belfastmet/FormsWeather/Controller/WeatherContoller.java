package uk.ac.belfastmet.FormsWeather.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.FormsWeather.Service.WeatherService;
import uk.ac.belfastmet.FormsWeather.domain.TodaysWeather;

@Controller
@RequestMapping("/")
public class WeatherContoller {

	@Autowired
	WeatherService weatherService;
	
	private TodaysWeather todaysWeather;
	
	@GetMapping("/")
	@ResponseBody
	public TodaysWeather home(Model model){
		model.addAttribute("pageTitle","Weather");
		this.weatherService = new WeatherService(null);
		this.todaysWeather = weatherService.getTodaysWeather();
		return this.todaysWeather;
	
	}
	
}
