package laboratorSP;

public class Table implements Element {
	private String numeTabel;
	
	public Table(String numeTabel) {
		this.numeTabel = numeTabel;
	}
	
	public void print() {
		System.out.println(this.numeTabel);
	}
}
