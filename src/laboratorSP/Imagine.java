package laboratorSP;

import java.util.concurrent.TimeUnit;

public class Imagine implements Element {
	private String numeImagine;
	
	public Imagine(String imagine) {
		this.numeImagine = imagine;
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String getName() {
		return numeImagine;
	}
	public void setName(String nume) {
		this.numeImagine = nume;
	}
	
	@Override
	public void print(){
		System.out.println("IMAGE");
		System.out.println(numeImagine);
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
	public void accept(Visitor v) {
		v.visit(this);
	}
}
