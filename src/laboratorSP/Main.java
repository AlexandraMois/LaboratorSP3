package laboratorSP;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		Chapter cap1 = new Chapter("masini");
		cap1.add(new Imagineproxy("pamela"));
		
		Chapter cap2 = new Chapter("Auto show");
		cap2.add(new Imagineproxy("myBMW"));
		
		cap2.add(new Imagineproxy("my car is trabi"));
		
		cap1.print();
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}

}
