package creating_File_Programs;

import java.io.File;
import java.io.IOException;

public class CreatePdfFile {
	public static void main(String[] args) {
		File f = new File("Java.pdf");
		
		try {
			boolean res = f.createNewFile();
			System.out.println(res);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Handled...");
		}
	}
}
