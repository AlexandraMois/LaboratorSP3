package laboratorSP;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Subchapter {
	private String titlu;
	private List <Element> continut = new ArrayList<Element>();
	/*private List <Text> paragrafe = new ArrayList<Text>();
	private List <Imagine> imagini = new ArrayList<Imagine>();
	private List <Table> tabele = new ArrayList<Table>();*/
	
	public Subchapter(String numeSubCapitol) {
		this.titlu = numeSubCapitol;
	}

	public void createNewParagraph(String string) {
		Text paragraf =  new Text(string);
		this.continut.add(paragraf);
	}

	public void createNewImage(String string) {
		Imagine imagine = new Imagine(string);
		this.continut.add(imagine);
	}

	public void createNewTable(String string) {
		Table tabel = new Table(string);
		this.continut.add(tabel);
	}
	
	public void print() {
		System.out.println("Titlu subcapitol: " + this.titlu);
		System.out.println("Continut: ");
		for(Element e : continut) {
			e.print();
		}
	}
}
