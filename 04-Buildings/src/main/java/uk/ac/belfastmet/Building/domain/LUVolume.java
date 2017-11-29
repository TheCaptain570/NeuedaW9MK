package uk.ac.belfastmet.Building.domain;

public class LUVolume {
	private int rank;
	private String name;
	private String country;
	private String place;
	private double floorArea;
	private double volume;
	private String Image;
	
	public LUVolume(int rank,String name, String country, String place, double floorArea, double volume,String Image) {
		super();
		this.rank = rank;
		this.name = name;
		this.country = country;
		this.place = place;
		this.floorArea = floorArea;
		this.volume = volume;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public double getFloorArea() {
		return floorArea;
	}

	public void setFloorArea(double floorArea) {
		this.floorArea = floorArea;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}
}
