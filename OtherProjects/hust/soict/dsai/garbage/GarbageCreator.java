package hust.soict.dsai.garbage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GarbageCreator {
	public static void main(String[] args) {
		String filename = System.getProperty("user.dir") + "/test.txt";
		String data = "";
		try{
			File f = new File(filename);
			Scanner reader = new Scanner(f);

			while (reader.hasNextLine()){
				data += reader.nextLine();
			}

			reader.close();
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}

		System.out.println(data);
		System.out.println("GarbageCreator");

	}
}

