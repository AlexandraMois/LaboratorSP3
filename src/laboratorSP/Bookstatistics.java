package laboratorSP;

public class Bookstatistics implements Visitor {

	protected int numOfImages = 0;
	protected int numOfParagraphs = 0;
	protected int numOfTable = 0;
	
	public void printStatistics() {
		System.out.println("Statistica carte:");
		System.out.println("Numar de imagini: " + numOfImages);
		System.out.println("Numar de paragrafe: " + numOfParagraphs);
		System.out.println("Numar de tabele: " + numOfTable);
	}
	
	@Override
	public void visit(Imagine i) {
		this.numOfImages++;		
	}

	@Override
	public void visit(Table t) {
		this.numOfTable++;
	}

	@Override
	public void visit(Text t) {
		this.numOfParagraphs++;
	}

	@Override
	public void visit(Imagineproxy t) {
		this.numOfImages++;
	}

}
