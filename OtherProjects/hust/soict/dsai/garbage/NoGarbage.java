package hust.soict.dsai.garbage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NoGarbage {
	public static void main(String[] args) {
		String filename = System.getProperty("user.dir") + "/test.txt";
		StringBuilder data = new StringBuilder();
		try{
			File f = new File(filename);
			Scanner reader = new Scanner(f);

			while (reader.hasNextLine()){
				data.append(reader.nextLine() + "\n");
			}

			reader.close();
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}

		System.out.println(data);
		System.out.println("NoGarbage");

	}
}

