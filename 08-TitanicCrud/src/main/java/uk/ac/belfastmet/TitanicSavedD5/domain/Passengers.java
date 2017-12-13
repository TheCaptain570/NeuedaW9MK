package uk.ac.belfastmet.TitanicSavedD5.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passengers {
	@Id
	@GeneratedValue
	private Integer passengerID;
	private String survived;
	private String pclass;
	private String name;
	private Integer age;
	private String sex;
	private double sibsp;
	private double parch;
	private String ticket;
	private String fair;
	private String cabin;
	private String embarked;
	
	public Passengers() {
		
	}
	public Passengers(String survived, String pclass, String name, Integer age, String sex, double sibsp, double parch,
			String ticket, String fair, String cabin, String embarked) {
		super();
		this.survived = survived;
		this.pclass = pclass;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.sibsp = sibsp;
		this.parch = parch;
		this.ticket = ticket;
		this.fair = fair;
		this.cabin = cabin;
		this.embarked = embarked;
	}

	public Integer getPassengerID() {
		return passengerID;
	}

	public void setPassengerID(Integer passengerID) {
		this.passengerID = passengerID;
	}

	public String getSurvived() {
		return survived;
	}

	public void setSurvived(String survived) {
		this.survived = survived;
	}

	public String getPclass() {
		return pclass;
	}

	public void setPclass(String pclass) {
		this.pclass = pclass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public double getSibsp() {
		return sibsp;
	}

	public void setSibsp(double sibsp) {
		this.sibsp = sibsp;
	}

	public double getParch() {
		return parch;
	}

	public void setParch(int parch) {
		this.parch = parch;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public String getFair() {
		return fair;
	}

	public void setFair(String fair) {
		this.fair = fair;
	}

	public String getCabin() {
		return cabin;
	}

	public void setCabin(String cabin) {
		this.cabin = cabin;
	}

	public String getEmbarked() {
		return embarked;
	}

	public void setEmbarked(String embarked) {
		this.embarked = embarked;
	}
}
