package uk.ac.belfastmet.FormsWeather.domain;

public class Weather {
	private String description;
	private String preciption;
	private Integer temperature;
	private Integer humidity;
	private Integer pressure;
	private Integer cloudcover;
	private Wind wind;
	private String image;
	public Weather(String description, String preciption, Integer temperature, Integer humidity, Integer pressure,
			Integer cloudcover, Wind wind, String image) {
		super();
		this.description = description;
		this.preciption = preciption;
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.cloudcover = cloudcover;
		this.wind = wind;
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPreciption() {
		return preciption;
	}
	public void setPreciption(String preciption) {
		this.preciption = preciption;
	}
	public Integer getTemperature() {
		return temperature;
	}
	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}
	public Integer getHumidity() {
		return humidity;
	}
	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}
	public Integer getPressure() {
		return pressure;
	}
	public void setPressure(Integer pressure) {
		this.pressure = pressure;
	}
	public Integer getCloudcover() {
		return cloudcover;
	}
	public void setCloudcover(Integer cloudcover) {
		this.cloudcover = cloudcover;
	}
	public Wind getWind() {
		return wind;
	}
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
}
