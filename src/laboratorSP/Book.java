package laboratorSP;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Book implements Element{
	private String titlu;
	private List<Author> autori = new ArrayList<Author>();
	private List<Element> capitole = new ArrayList<Element>();
	
	public Book(String titlu) {
		this.titlu = titlu;
	}
	
	public String getTitle() {
		return titlu;
	}

	public void setTitle(String titlu) {
		this.titlu = titlu;
	}
	
	public void addAuthor(Author autor) {
		this.autori.add(autor);
	}
	
	public void add(Element e) {
		capitole.add(e);
		
	}

	public void remove(Element e) {
		// TODO Auto-generated method stub
		
	}

	public void getChild(int index) {
		// TODO Auto-generated method stub
		
	}

	public void print() {
		System.out.println(titlu);
		for (Element elem : capitole){
			((Book) elem).print();
		}
	}

}
