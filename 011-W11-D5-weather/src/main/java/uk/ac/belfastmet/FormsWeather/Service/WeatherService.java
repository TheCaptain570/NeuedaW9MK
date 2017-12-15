package uk.ac.belfastmet.FormsWeather.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.FormsWeather.domain.TodaysWeather;

@Service
public class WeatherService {
	
	private RestTemplate restTemplate;
	String belfastWeatherURL = "http://www.codingfury.net/training/weathersample/weather.php?location=belfast";
	String dublinWeatherURL = "http://www.codingfury.net/training/weathersample/weather.php?location=dublin";
	String londonWeatherURL = "http://www.codingfury.net/training/weathersample/weather.php?location=london";
	
	public WeatherService(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}
	
	public TodaysWeather getTodaysWeather(){
		String todaysWeatherUrl = this.belfastWeatherURL;
		TodaysWeather todaysWeather = restTemplate.getForObject(todaysWeatherUrl, TodaysWeather.class);
		return todaysWeather;
	}
	
	
	
	
}
