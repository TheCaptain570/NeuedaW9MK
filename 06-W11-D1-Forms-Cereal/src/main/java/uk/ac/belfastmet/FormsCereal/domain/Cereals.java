package uk.ac.belfastmet.FormsCereal.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Cereals {
	
	@Id
	@GeneratedValue
	Integer Cereal_id;
	@NotEmpty
	String Manufacturer; 
	@NotEmpty
	String name;          
	double Energy;    
	double Calories;    
	double Protein;       
	double Carbohydrate;  
	double Sugars;        
	double Fat;            
	double Saturates;     
	double Fibre;         
	String Sodium;       
	String Salt;          
	String Iron;
	public Cereals() {
		super();
	}
	public Cereals(Integer cereal_id, String manufacturer, String name, double energy, double calories, double protein,
			double carbohydrate, double sugars, double fat, double saturates, double fibre, String sodium, String salt,
			String iron) {

		Cereal_id = cereal_id;
		Manufacturer = manufacturer;
		this.name = name;
		Energy = energy;
		Calories = calories;
		Protein = protein;
		Carbohydrate = carbohydrate;
		Sugars = sugars;
		Fat = fat;
		Saturates = saturates;
		Fibre = fibre;
		Sodium = sodium;
		Salt = salt;
		Iron = iron;
	}
	public Integer getCereal_id() {
		return Cereal_id;
	}
	public void setCereal_id(Integer cereal_id) {
		Cereal_id = cereal_id;
	}
	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getEnergy() {
		return Energy;
	}
	public void setEnergy(double energy) {
		Energy = energy;
	}
	public double getCalories() {
		return Calories;
	}
	public void setCalories(double calories) {
		Calories = calories;
	}
	public double getProtein() {
		return Protein;
	}
	public void setProtein(double protein) {
		Protein = protein;
	}
	public double getCarbohydrate() {
		return Carbohydrate;
	}
	public void setCarbohydrate(double carbohydrate) {
		Carbohydrate = carbohydrate;
	}
	public double getSugars() {
		return Sugars;
	}
	public void setSugars(double sugars) {
		Sugars = sugars;
	}
	public double getFat() {
		return Fat;
	}
	public void setFat(double fat) {
		Fat = fat;
	}
	public double getSaturates() {
		return Saturates;
	}
	public void setSaturates(double saturates) {
		Saturates = saturates;
	}
	public double getFibre() {
		return Fibre;
	}
	public void setFibre(double fibre) {
		Fibre = fibre;
	}
	public String getSodium() {
		return Sodium;
	}
	public void setSodium(String sodium) {
		Sodium = sodium;
	}
	public String getSalt() {
		return Salt;
	}
	public void setSalt(String salt) {
		Salt = salt;
	}
	public String getIron() {
		return Iron;
	}
	public void setIron(String iron) {
		Iron = iron;
	}        
	
}
