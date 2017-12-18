package uk.ac.belfastmet.FormsWeather2.domain;

public class Location {
	private String name;
	private String latitude;
	private String longitude;
	public Location() {}
	public Location(String name, String latitude, String longitude) {
		super();
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
}
