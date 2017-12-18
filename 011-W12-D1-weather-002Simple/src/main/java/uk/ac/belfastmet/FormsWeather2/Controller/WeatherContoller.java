package uk.ac.belfastmet.FormsWeather2.Controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import uk.ac.belfastmet.FormsWeather2.domain.TodaysWeather;
import uk.ac.belfastmet.FormsWeather2.domain.Weather;



@Controller
@RequestMapping("/")
public class WeatherContoller {
	
	@Value("${api.baseWeatherUrl}")
	private String baseWeatherUrl;
	
	public WeatherContoller() {}
	RestTemplate restTemplate;
	

	@GetMapping("/")
	public String home(Model model){
		model.addAttribute("pageTitle","Weather");
		
		String belfastWeatherURL= this.baseWeatherUrl + "belfast";
		
		RestTemplate restTemplate = new RestTemplate();
		TodaysWeather todaysWeather = restTemplate.getForObject(belfastWeatherURL, TodaysWeather.class);
		Weather weather = todaysWeather.getWeather();
		
		model.addAttribute("weather",weather);
		return "homePage";
	
	}


	public String getBaseWeatherUrl() {
		return baseWeatherUrl;
	}


	public void setBaseWeatherUrl(String baseWeatherUrl) {
		this.baseWeatherUrl = baseWeatherUrl;
	}
	
}
