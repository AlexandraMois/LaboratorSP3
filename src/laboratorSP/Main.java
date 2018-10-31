package laboratorSP;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Chapter cap1 = new Chapter("Capitolul 1");
		Text p1 = new Text("Paragraph 1");
		cap1.add(p1);
		Text p2 = new Text("Paragraph 2");
		cap1.add(p2);
		Text p3 = new Text("Paragraph 3");
		cap1.add(p3);
		Text p4 = new Text("Paragraph 4");
		cap1.add(p4);
			
		System.out.println("Printing without Alignment");

		System.out.println();
		cap1.print();
			
		p1.setAlignStrategy(new Aligncenter());
		p2.setAlignStrategy(new Alignright());
		p3.setAlignStrategy(new Alignleft());
			
		System.out.println();
		System.out.println("Printing with Alignment");
		System.out.println();
		cap1.print();

	}

}
