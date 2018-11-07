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
		cap1.add(new Imagineproxy("ImageOne"));
		cap1.add(new Imagine("ImageTwo"));
		cap1.add(new Text("Some text"));
		cap1.add(new Table("Table 1"));
			
		Bookstatistics stats = new Bookstatistics();
		cap1.accept(stats);
		stats.printStatistics();


	}

}
