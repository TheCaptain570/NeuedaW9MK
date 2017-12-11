package uk.ac.belfastmet.FormsCereal.domain;

public class Cereal {
	Integer Cereal_id;  
	String Manufacturer; 
	String cereal;          
	double Energy;    
	double Calories;    
	double Protein;       
	double Carbohydrate;  
	double Sugars;        
	double Fat;            
	double Saturates;     
	double Fibre;         
	double Sodium;       
	double Salt;          
	double Iron;
	public Cereal(Integer cereal_id, String manufacturer, String cereal, double energy, double calories, double protein,
			double carbohydrate, double sugars, double fat, double saturates, double fibre, double sodium, double salt,
			double iron) {
		super();
		Cereal_id = cereal_id;
		Manufacturer = manufacturer;
		this.cereal = cereal;
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
	public String getCereal() {
		return cereal;
	}
	public void setCereal(String cereal) {
		this.cereal = cereal;
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
	public double getSodium() {
		return Sodium;
	}
	public void setSodium(double sodium) {
		Sodium = sodium;
	}
	public double getSalt() {
		return Salt;
	}
	public void setSalt(double salt) {
		Salt = salt;
	}
	public double getIron() {
		return Iron;
	}
	public void setIron(double iron) {
		Iron = iron;
	}        
	
}
