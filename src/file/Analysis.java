package file;

import java.io.File;
import java.util.Scanner;

public class Analysis {

	private File file;

	public Analysis(File file) {
		this.file = file;

	}

	public int lines() throws Exception {
		Scanner reader = new Scanner(file);
		int count = 0;
		String buffer = "";
		while (reader.hasNextLine()) {
			buffer = reader.nextLine();
			count++;
		}
		reader.close();
		return count;

	}

	public int characters() throws Exception {
		Scanner reader = new Scanner(file);
		int count = 0;
		String buffer = "";
		while (reader.hasNextLine()) {
			buffer = reader.next();
			count += buffer.length();
			count++;

		}
		reader.close();
		return count;
	}

}
