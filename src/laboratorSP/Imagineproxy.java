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
			try {
				image = new Imagine(nume);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		image.print();
	}
}
