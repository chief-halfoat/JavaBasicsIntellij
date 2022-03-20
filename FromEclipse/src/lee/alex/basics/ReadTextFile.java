package lee.alex.basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {
		
		//
		
		File file = new File("/Users/johna/OneDrive/Desktop/captmidn.txt");
		Scanner scan = new Scanner(file);
		
		String fileContent = "";
		
		while(scan.hasNextLine()) {
			fileContent = fileContent.concat(scan.nextLine()+"\n");
		}
		FileWriter writer = new FileWriter("/USers/johna/OneDrive/Desktop/newfile.txt");
		writer.write(fileContent);
		writer.close();
	}
}
