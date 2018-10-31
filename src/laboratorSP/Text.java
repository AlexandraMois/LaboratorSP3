package laboratorSP;

public class Text implements Element{
	private String text;
	
	public Text(String text) {
		this.text = text;
	}
	
	public void print() {
		System.out.println(this.text);
	}
}
