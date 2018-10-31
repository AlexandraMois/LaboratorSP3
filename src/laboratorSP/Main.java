package laboratorSP;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Book myBook = new Book("Maestrul si Margareta");
		Author autor = new Author("Mihail Bulgakov");
		myBook.addAuthor(autor);
		int indexChapterOne = myBook.createChapter("Capitol 1");
		Chapter chp1 = myBook.getChapter(indexChapterOne);
		int indexSubChapterOneOne = myBook.createSubChapter(indexChapterOne, "Subcapitol 1");
		Subchapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
		
		scOneOne.createNewParagraph("Paragraph 1");
		scOneOne.createNewParagraph("Paragraph 2");
		scOneOne.createNewParagraph("Paragraph 3");
		scOneOne.createNewImage("Image 1");
		scOneOne.createNewParagraph("Paragraph 4");
		scOneOne.createNewTable("Table 1");
		scOneOne.createNewParagraph("Paragraph 5");
		
		scOneOne.print();
	}

}
