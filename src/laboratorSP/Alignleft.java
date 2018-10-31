package laboratorSP;

public class Alignleft implements Alignstrategy{
	@Override
	public void printAligned(String text) {
		System.out.println(text + "*****");
	}

}
