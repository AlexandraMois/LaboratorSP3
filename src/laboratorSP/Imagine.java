package laboratorSP;

import java.util.concurrent.TimeUnit;

public class Imagine implements Element {
	private String numeImagine;
	
	public Imagine(String imagine) throws InterruptedException {
		this.numeImagine = imagine;
		TimeUnit.SECONDS.sleep(5);
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
}
