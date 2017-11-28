package uk.ac.belfastmet.dwarfs.domain;

public class Dwarf {
	private String Name;
	private String Author;
	private String Link;
	
	public Dwarf() {}
	
public Dwarf(String Name,String Author,String Link) {
	this.Name = Name;
	this.Author = Author;
	this.Link = Link;
	}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public String getAuthor() {
	return Author;
}

public void setAuthor(String Author) {
	this.Author = Author;
}

public String getLink() {
	return Link;
}

public void setLink(String link) {
	Link = link;
}
}
