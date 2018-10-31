package laboratorSP;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
	private String titlu;
	private List <Subchapter> subcapitole = new ArrayList<Subchapter>();
	
	public Chapter(String numeCapitol) {
		this.titlu = numeCapitol;
	}
	
	public int createSubChapter(String numeSubCapitol) {
		Subchapter capitol = new Subchapter(numeSubCapitol); 
		this.subcapitole.add(capitol);
		
		return this.subcapitole.indexOf(capitol);
	}

	public Subchapter getSubChapter(int index) {
		return this.subcapitole.get(index);
	}
	
}
