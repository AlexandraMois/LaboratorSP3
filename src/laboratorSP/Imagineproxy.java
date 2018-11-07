package laboratorSP;

public class Imagineproxy implements Element {

	private String nume;
	private Imagine image = null;
	public Imagineproxy (String nume) {
		this.nume = nume;
	}
	
	@Override
	public void add(Element e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void getChild(int index) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void print() {
		if(image == null) 
		{
			image = new Imagine(nume);
		}
		image.print();
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
