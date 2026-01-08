package creating_File_Programs;

import java.io.File;
import java.io.IOException;

public class CreateExcelFile {
	public static void main(String[] args) {
		File f = new File("Student.xlsx");
		
		try {
			boolean res = f.createNewFile();
			System.out.println(res);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Handled...");
		}
	}
}
