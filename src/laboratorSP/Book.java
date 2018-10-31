package laboratorSP;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Book {
	private String titlu;
	private List <Author> autori = new ArrayList<Author>();
	private Tableofcontents cuprins;
	private List <Chapter> capitole = new ArrayList<Chapter>();
	
	public Book(String titlu) {
		this.titlu = titlu;
	}
	
	public void addAuthor(Author autor) {
		this.autori.add(autor);
	}
	
	public int createChapter(String numeCapitol) {
		Chapter capitol = new Chapter(numeCapitol); 
		this.capitole.add(capitol);
		
		return this.capitole.indexOf(capitol);
	}
	
	public int createSubChapter(Integer indexChapter, String numeSubCapitol) {
		Chapter chapter = this.capitole.get(indexChapter);
		chapter.createSubChapter(numeSubCapitol);
		
		return chapter.createSubChapter(numeSubCapitol);
	}

	public Chapter getChapter(int index) {
		return this.capitole.get(index);
	}

}
