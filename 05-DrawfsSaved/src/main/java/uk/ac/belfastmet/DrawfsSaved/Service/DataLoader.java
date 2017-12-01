package uk.ac.belfastmet.DrawfsSaved.Service;

//import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.DrawfsSaved.domain.Dwarf;
import uk.ac.belfastmet.DrawfsSaved.repositories.DwarfRepository;

@Service
public class DataLoader {
	
	@Autowired
	private DwarfRepository dwarfRepository;
	
			

	public DataLoader(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}



	@PostConstruct

	public void LoadData() {
	
		
		
		Dwarf Happy = new Dwarf("Happy","Disney","Happy.png");
		Dwarf Dopey = new Dwarf("Dopey","Disney","Dopey.png");
		Dwarf Grumpy = new Dwarf("Grumpy","Disney","Grumpy.png");
		Dwarf Doc = new Dwarf("Doc","Disney","Doc.png");
		Dwarf Sneezy = new Dwarf("Sneezy","Disney","Sneezy.png");
		Dwarf Sleepy = new Dwarf("Sleepy","Disney","Sleepy.png");
		Dwarf Bashful = new Dwarf("Bashful","Disney","Bashful.png");
	

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
		
		dwarfRepository.save(Happy);
		dwarfRepository.save(Dopey);
		dwarfRepository.save(Grumpy);
		dwarfRepository.save(Doc);
		dwarfRepository.save(Sneezy);
		dwarfRepository.save(Sleepy);
		dwarfRepository.save(Bashful);	
		
		dwarfRepository.save(Thorin); 
		dwarfRepository.save(Balin); 
		dwarfRepository.save(Dwalin); 
		dwarfRepository.save(Fili); 
		dwarfRepository.save(Kili); 
		dwarfRepository.save(Dori); 
		dwarfRepository.save(Nori); 
		dwarfRepository.save(Ori);
		dwarfRepository.save(Oin);
		dwarfRepository.save(Gloin); 
		dwarfRepository.save(Bifur); 
		dwarfRepository.save(Bofur); 
		dwarfRepository.save(Bombur);
		
		
	}
}