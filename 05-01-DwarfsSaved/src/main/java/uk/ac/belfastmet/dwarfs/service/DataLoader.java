package uk.ac.belfastmet.dwarfs.service;

//import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;
import uk.ac.belfastmet.dwarfs.repositories.DwarfRepository;

@Service
public class DataLoader {

	public DataLoader(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}

	@Autowired
	private DwarfRepository dwarfRepository;

	@PostConstruct
	public void loadData() {

		Dwarf sleepy = new Dwarf("Sleepy", "Disney", "sleepy.png");
		Dwarf dopey = new Dwarf("Dopey", "Disney", "dopey.png");
		Dwarf bashful = new Dwarf("Bashful", "Disney", "bashful.png");
		Dwarf sneezy = new Dwarf("Sneezy", "Disney", "sneezy.png");
		Dwarf doc = new Dwarf("Doc", "Disney", "doc.png");
		Dwarf grumpy = new Dwarf("Grumpy", "Disney", "grumpy.png");
		Dwarf happy = new Dwarf("Happy", "Disney", "happy.png");

		dwarfRepository.save(sleepy);
		dwarfRepository.save(dopey);
		dwarfRepository.save(bashful);
		dwarfRepository.save(sneezy);
		dwarfRepository.save(doc);
		dwarfRepository.save(grumpy);
		dwarfRepository.save(happy);

		Dwarf thorin = new Dwarf("Thorin", "Tolkien", "thorin.png");
		Dwarf balin = new Dwarf("Balin", "Tolkien", "balin.png");
		Dwarf dwalin = new Dwarf("Dwalin", "Tolkien", "dwalin.png");
		Dwarf fili = new Dwarf("Fili", "Tolkien", "fili.png");
		Dwarf kili = new Dwarf("Kili", "Tolkien", "kili.png");
		Dwarf dori = new Dwarf("Dori", "Tolkien", "dori.png");
		Dwarf nori = new Dwarf("Nori", "Tolkien", "nori.png");
		Dwarf ori = new Dwarf("Ori", "Tolkien", "ori.png");
		Dwarf oin = new Dwarf("Oin", "Tolkien", "oin.png");
		Dwarf bifur = new Dwarf("Bifur", "Tolkien", "bifur.png");
		Dwarf bofur = new Dwarf("Bofur", "Tolkien", "bofur.png");
		Dwarf bombur = new Dwarf("Bombur", "Tolkien", "bombur.png");
		Dwarf gloin = new Dwarf("Gloin", "Tolkien", "gloin.png");

		dwarfRepository.save(thorin);
		dwarfRepository.save(balin);
		dwarfRepository.save(dwalin);
		dwarfRepository.save(fili);
		dwarfRepository.save(kili);
		dwarfRepository.save(dori);
		dwarfRepository.save(nori);
		dwarfRepository.save(ori);
		dwarfRepository.save(oin);
		dwarfRepository.save(bombur);
		dwarfRepository.save(bifur);
		dwarfRepository.save(bofur);
		dwarfRepository.save(gloin);

	}

}
