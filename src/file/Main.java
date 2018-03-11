package file;

import java.io.File;

public class Main {

	public static void main(String[] args) throws Exception {
		File file = new File("src/testfile");
		Analysis analysis = new Analysis(file);
		System.out.println("Lines: " + analysis.lines());
		System.out.println("Characters: " + analysis.characters());

	}

}
