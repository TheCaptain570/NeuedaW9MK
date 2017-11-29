package uk.ac.belfastmet.dwarfs.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;
@Service

	

public class DwarfService {
	
	private ArrayList<Dwarf> disneyDwarfs;
	private ArrayList<Dwarf> tolkienDwarfs;
	
public ArrayList<Dwarf> getTolkienDwarfs(){
	
	ArrayList<Dwarf> dwarfs= new ArrayList<Dwarf>();

	Dwarf Thorin = new Dwarf("Thorin","Tolkien","Thorin.png");
	Dwarf Balin = new Dwarf("Balin","Tolkien","Balin.png");
	Dwarf Dwalin = new Dwarf("Dwalin","Tolkien","Dwalin.png");
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

	dwarfs.add(Thorin); 
	dwarfs.add(Balin); 
	dwarfs.add(Dwalin); 
	dwarfs.add(Fili); 
	dwarfs.add(Kili); 
	dwarfs.add(Dori); 
	dwarfs.add(Nori); 
	dwarfs.add(Ori);
	dwarfs.add(Oin);
	dwarfs.add(Gloin); 
	dwarfs.add(Bifur); 
	dwarfs.add(Bofur); 
	dwarfs.add(Bombur); 
	
	return dwarfs;
}

public ArrayList<Dwarf> getDisneyDwarfs(){
	
	ArrayList<Dwarf> dwarfs= new ArrayList<Dwarf>();
	
	Dwarf Happy = new Dwarf("Happy","Disney","Happy.png");
	Dwarf Dopey = new Dwarf("Dopey","Disney","Dopey.png");
	Dwarf Grumpy = new Dwarf("Grumpy","Disney","Grumpy.png");
	Dwarf Doc = new Dwarf("Doc","Disney","Doc.png");
	Dwarf Sneezy = new Dwarf("Sneezy","Disney","Sneezy.png");
	Dwarf Sleepy = new Dwarf("Sleepy","Disney","Sleepy.png");
	Dwarf Bashful = new Dwarf("Bashful","Disney","Bashful.png");
	
	dwarfs.add(Happy);
	dwarfs.add(Dopey);
	dwarfs.add(Grumpy);
	dwarfs.add(Doc);
	dwarfs.add(Sneezy);
	dwarfs.add(Sleepy);
	dwarfs.add(Bashful);	
	
	return dwarfs;
}
}