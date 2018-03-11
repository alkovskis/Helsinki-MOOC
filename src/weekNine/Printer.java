package weekNine;

import java.io.File;
import java.util.Scanner;

public class Printer {

	private String fileName;

	public Printer(String fileName) throws Exception {
		this.fileName = fileName;
	}

	public void printLinesWhichContain(String word) throws Exception {
		File f = new File(this.fileName);
		Scanner reader = new Scanner(f);

		String line = "";
		String buffer = "";

		while (reader.hasNextLine()) {
			line = reader.nextLine();
			if (line.contains(word)) {
				buffer += line;
				buffer += "\n";
				System.out.println(line);
			}

		}

	}

	public static void main(String[] args) throws Exception {
		Printer printer = new Printer("src/textfile");

		printer.printLinesWhichContain("Väinämöinen");
		System.out.println("-----");
		printer.printLinesWhichContain("Frank Zappa");
		System.out.println("-----");
		printer.printLinesWhichContain("");
		System.out.println("-----");

	}

}
