import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Dwarfs = new ArrayList<String>();
		ArrayList<String> Dwarves = new ArrayList<String>();
		  /*This is how elements should be added to the array list*/
		Dwarfs.add("Grumpy");
		Dwarfs.add("Dopey");
		Dwarfs.add("Doc");
		Dwarfs.add("Happy");
		Dwarfs.add("Sneezy");
		Dwarfs.add("Sleepy");
		Dwarfs.add("Bashful");

//---------------------------------------
		Dwarves.add("Thorin");
		Dwarves.add("Balin");
		Dwarves.add("Dwalin");
		Dwarves.add("Fili");
		Dwarves.add("Kili");
		Dwarves.add("Dori");
		Dwarves.add("Nori");
		Dwarves.add("Ori");
		Dwarves.add("Oin");
		Dwarves.add("Gloin");
		Dwarves.add("Bifur");
		Dwarves.add("Bofur");
		Dwarves.add("Bombur");
		Dwarves.add("Bilbo");
		
		System.out.println("Disney Dwarfs are:");
		for (int i = 0;i < Dwarfs.size();i++) {
			System.out.print("Disney Dwarfs " + (i + 1)+" :");
			System.out.println(Dwarfs.get(i));
		}
		System.out.println("\nTolken Dwarfs are:");

		for (int i = 0;i < Dwarves.size();i++) {
			System.out.print("Tolken Dwarves " + (i + 1)+" :");
			System.out.println(Dwarves.get(i));
		}
		
		}

}
