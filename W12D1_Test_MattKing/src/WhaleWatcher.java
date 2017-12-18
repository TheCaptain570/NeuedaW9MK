import java.util.ArrayList;


public class WhaleWatcher {

	public static void main(String[] args) {
		ArrayList<Whale> Whaleygoodtime = new ArrayList<Whale>();
		
		Whale Right = new Whale("Right", "Atlantic", 2001, 21,16);
		Whale Blue = new Whale("Blue", "Pacific", 2001, 23,16);
		Whale Sperm = new Whale("Sperm", "Atlantic", 1900, 20,40);
		Whale Humpback = new Whale("Right", "Antartic", 919,13,13);
		
		Whaleygoodtime.add(Right);
		Whaleygoodtime.add(Blue);
		Whaleygoodtime.add(Sperm);
		Whaleygoodtime.add(Humpback);
		
		//       Print all
		
		System.out.println("\tPrint all");
		for (int i = 0; i < Whaleygoodtime.size(); i++) {
			System.out.println(Whaleygoodtime.get(i));
		}
		
		//       print  main ocean is atlantic 
		
		System.out.println("\tPrint Atlantic");
		for (Whale WaterBeast: Whaleygoodtime) {
			if(WaterBeast.getOcean().equals("Atlantic"))
			{
				System.out.println(WaterBeast.toString());
			}
			else{};
		}	
		
//      print fastest swimmer  
		int CurrentFastest = 0;
		String CurrentName = "";
		System.out.println("\tPrint Fastest Swimmer");
		for (int i = 0; i < Whaleygoodtime.size(); i++) {
			
			if(Whale.getMax_speed() > CurrentFastest)
			{
				CurrentFastest =  Whale.getMax_speed();
				CurrentName = Whale.getName();
				System.out.println("set");
				System.out.println(CurrentFastest);
			}
			// not looping correctly
			else{System.out.println("smaller");};
		}
		System.out.println(CurrentName);
	}

}


