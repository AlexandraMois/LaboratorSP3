package laboratorSP;

public class Author {
	private String nume;
	
	public Author(String nume) {
		this.nume = nume;
	}
	
	public void print() {
		System.out.println("Autor: " + this.nume);
	}

}
