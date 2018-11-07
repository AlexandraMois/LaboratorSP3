package laboratorSP;

public class Text implements Element{
	private String text;
	private Alignstrategy s;
	
	public Text(String text) {
		this.text = text;
	}
	
	public String getParagraph() {
		return text;
	}
	public void setParagraph(String text) {
		this.text = text;
	}
	
	@Override
	public void add(Element e) {
		
	}
	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getChild(int index) {
		// TODO Auto-generated method stub
		
	}
	
	public void setAlignStrategy(Alignstrategy s) {
		this.s = s;
	}
	
	public void print() {
		if(s == null) {
			System.out.println(this.text);
		} else {
			s.printAligned(this.text);
		}
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
