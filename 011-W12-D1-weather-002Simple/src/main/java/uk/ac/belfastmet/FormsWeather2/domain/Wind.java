package uk.ac.belfastmet.FormsWeather2.domain;

public class Wind {
	private Double speed;
	private String direction;
	public Wind() {}
	public Wind(Double speed, String direction) {
		super();
		this.speed = speed;
		this.direction = direction;
	}
	public Double getSpeed() {
		return speed;
	}
	public void setSpeed(Double speed) {
		this.speed = speed;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
}
