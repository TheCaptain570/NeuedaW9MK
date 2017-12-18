import java.util.ArrayList;


public class Whale extends Animal{
	
	String ocean;
	int Weight;
	static int max_speed;
	int length;

	public Whale(String name) {
		super(name);
	}

	public Whale(String name, String ocean, int weight, int max_speed,int length) {
		super(name);
		this.ocean = ocean;
		this.Weight = weight;
		this.max_speed = max_speed;
		this.length = length;
	}

	public String getOcean() {
		return ocean;
	}

	public void setOcean(String ocean) {
		this.ocean = ocean;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		Weight = weight;
	}

	public static int getMax_speed() {
		return max_speed;
	}

	public void setMax_speed(int max_speed) {
		this.max_speed = max_speed;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return  
				"Name = " + getName() +
				"\nOcean = " + ocean + 
				"\nWeight = " + Weight + 
				"\nmax_speed = "+ max_speed + 
				"\nlength = " + length+
				"\n";
	}
}

