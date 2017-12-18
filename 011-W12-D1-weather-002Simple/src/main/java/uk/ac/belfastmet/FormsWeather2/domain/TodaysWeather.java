package uk.ac.belfastmet.FormsWeather2.domain;

public class TodaysWeather {
	private Location location;
	private Weather weather;
	
	public TodaysWeather(Location location, Weather weather) {
		super();
		this.location = location;
		this.weather = weather;
	}
	public TodaysWeather() {
		super();
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Weather getWeather() {
		return weather;
	}
	public void setWeather(Weather weather) {
		this.weather = weather;
	}
	@Override
	public String toString() {
		return "TodaysWeather [location=" + location + ", weather=" + weather + "]";
	}
}
