package laboratorSP;

public interface Visitor {
	public void visit(Imagine i);
	public void visit(Table t);
	public void visit(Text t);
	public void visit(Imagineproxy t);
}
