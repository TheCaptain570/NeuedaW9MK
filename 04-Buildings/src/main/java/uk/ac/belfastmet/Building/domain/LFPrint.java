package uk.ac.belfastmet.Building.domain;

public class LFPrint {
	private int rank;
	private String name;
	private String country;
	private String place;
	private double footprint;
	private String lengthwidth;
	private String Image;
	
	public LFPrint(int rank,String name, String country, String place, double footprint, String lengthwidth,String Image) {
		super();
		this.rank = rank;
		this.name = name;
		this.country = country;
		this.place = place;
		this.footprint = footprint;
		this.lengthwidth = lengthwidth;
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

	public double getFootprint() {
		return footprint;
	}

	public void setFootprint(double footprint) {
		this.footprint = footprint;
	}

	public String getLengthwidth() {
		return lengthwidth;
	}

	public void setLengthwidth(String lengthwidth) {
		this.lengthwidth = lengthwidth;
	}
	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}
}
