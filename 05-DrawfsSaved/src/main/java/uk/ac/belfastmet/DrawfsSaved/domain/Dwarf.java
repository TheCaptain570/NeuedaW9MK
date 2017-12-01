package uk.ac.belfastmet.DrawfsSaved.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dwarf {
	@Id
	@GeneratedValue
	private Integer dwarfID;
	private String name;
	private String author;
	private String link;
		
	public Dwarf() {}
		
	public Dwarf(String name,String author,String link) {
		this.name = name;
		this.author = author;
		this.link = link;
		}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String Author) {
		this.author = Author;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}

