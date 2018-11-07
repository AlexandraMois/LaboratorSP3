package laboratorSP;

public class Table implements Element {
	private String numeTabel;
	
	public Table(String numeTabel) {
		this.numeTabel = numeTabel;
	}
	
	public String getName() {
		return numeTabel;
	}
	public void setName(String name) {
		this.numeTabel = name;
	}
	
	@Override
	public void print(){
		System.out.println("TABLE");
		System.out.println(numeTabel);
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
