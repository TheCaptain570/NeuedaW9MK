package uk.ac.belfastmet.Building.domain;

public class LFArea {
	private int rank;
	private String name;
	private String country;
	private String place;
	private double floorArea;
	private String Image;
	
	public LFArea(int rank,String name, String country, String place, double floorArea,String Image) {
		super();
		this.rank = rank;
		this.name = name;
		this.country = country;
		this.place = place;
		this.floorArea = floorArea;
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
	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}
}
