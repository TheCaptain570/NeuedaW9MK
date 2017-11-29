
public class Dwarf {
		private String name;
		private String author;
		private String link;
		
		public Dwarf() {}
		
	public Dwarf(String Name,String Author,String Link) {
		this.name = Name;
		this.author = Author;
		this.link = Link;
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

