package laboratorSP;

public class Imagine implements Element {
	private String numeImagine;
	
	public Imagine(String imagine) {
		this.numeImagine = imagine;
	}
	
	public void print() {
		System.out.println(this.numeImagine);
	}
}
