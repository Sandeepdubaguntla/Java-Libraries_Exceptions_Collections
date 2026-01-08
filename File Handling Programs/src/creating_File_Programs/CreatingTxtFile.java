package creating_File_Programs;

import java.io.File;
import java.io.IOException;

public class CreatingTxtFile {
	public static void main(String[] args) {
		File f = new File("Abc.txt");
		
		try {
			boolean res = f.createNewFile();
			System.out.println(res);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Handled...");
		}
	}
}
