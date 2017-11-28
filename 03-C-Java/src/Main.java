import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dwarfs and Dwarves
		ArrayList<Dwarf> dwarf= new ArrayList<Dwarf>();
		
		Dwarf Happy = new Dwarf("Happy","Disney","Happy.png");
		Dwarf Dopey = new Dwarf("Dopey","Disney","Dopey.png");
		Dwarf Grumpy = new Dwarf("Grumpy","Disney","Grumpy.png");
		Dwarf Doc = new Dwarf("Doc","Disney","Doc.png");
		Dwarf Sneezy = new Dwarf("Sneezy","Disney","Sneezy.png");
		Dwarf Sleepy = new Dwarf("Sleepy","Disney","Sleepy.png");
		Dwarf Bashful = new Dwarf("Bashful","Disney","Bashful.png");	
		Dwarf Thorin = new Dwarf("Thorin","Tolkien","Thorin.png");
		Dwarf Balin = new Dwarf("Balin","Tolkien","Balin.png");
		Dwarf Bwalin = new Dwarf("Bwalin","Tolkien","Bwalin.png");
		Dwarf Fili = new Dwarf("Fili","Tolkien","Fili.png");
		Dwarf Kili = new Dwarf("Kili","Tolkien","Kili.png");
		Dwarf Dori = new Dwarf("Dori","Tolkien","Dori.png");
		Dwarf Nori = new Dwarf("Nori","Tolkien","Nori.png");
		Dwarf Ori = new Dwarf("Ori","Tolkien","Ori.png");
		Dwarf Oin = new Dwarf("Oin","Tolkien","Oin.png");
		Dwarf Gloin = new Dwarf("Gloin","Tolkien","Gloin.png");
		Dwarf Bifur = new Dwarf("Bifur","Tolkien","Bifur.png");
		Dwarf Bofur = new Dwarf("Bofur","Tolkien","Bofur.png");
		Dwarf Bombur = new Dwarf("Bombur","Tolkien","Bombur.png");


		dwarf.add(Happy);
		dwarf.add(Dopey);
		dwarf.add(Grumpy);
		dwarf.add(Doc);
		dwarf.add(Sneezy);
		dwarf.add(Sleepy);
		dwarf.add(Bashful);	
		
		dwarf.add(Thorin); 
		dwarf.add(Balin); 
		dwarf.add(Bwalin); 
		dwarf.add(Fili); 
		dwarf.add(Kili); 
		dwarf.add(Dori); 
		dwarf.add(Nori); 
		dwarf.add(Ori);
		dwarf.add(Oin);
		dwarf.add(Gloin); 
		dwarf.add(Bifur); 
		dwarf.add(Bofur); 
		dwarf.add(Bombur); 
		System.out.println("Company of Thorin");
		System.out.println("Name\tAuthor\tPicture");
			for(Dwarf dwarfX: dwarf) {
				if(dwarfX.getAuthor().equals("Disney")) {
					System.out.println(dwarfX.getName() +"\t"+ dwarfX.getAuthor()+"\t"+ dwarfX.getLink());
				}
				
			}
			System.out.println("\nCompany of Snow White");
			System.out.println("Name\tAuthor\tPicture");
			for(Dwarf dwarfX: dwarf) {
				if(dwarfX.getAuthor().equals("Tolkien")) {
					System.out.println(dwarfX.getName() +"\t"+ dwarfX.getAuthor()+"\t"+ dwarfX.getLink());
				}
				
			}
		
		}
	}