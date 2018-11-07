package laboratorSP;

import java.util.ArrayList;
import java.util.List;

public class Chapter implements Element {
	private String titlu;
	private List <Element> content = new ArrayList<Element>();
	
	public Chapter(String numeCapitol) {
		this.titlu = numeCapitol;
	}
	
	public Chapter(String titlu, List<Element> content){
		this.titlu = titlu;
		this.content = content;
	}
	
	@Override
	public void add(Element e) {
		content.add(e);
		
	}
	@Override
	public void remove(Element e) {
		content.remove(e);		
	}
	@Override
	public void getChild(int index) {
		content.get(index);
		
	}
	@Override
	public void print() {
		System.out.println(titlu);
		for(Element elem : content){
			elem.print();
		}
		
	}
	
	public String getTitle() {
		return titlu;
	}
	
	public void setTitle(String titlu) {
		this.titlu = titlu;
	}
	
	public List<Element> getContent() {
		return content;
	}
	
	public void setContent(List<Element> content) {
		this.content = content;
	}
	
	@Override
	public void accept(Visitor v) {
		for(Element elem : content) {
			elem.accept(v);
		}
	}
}
