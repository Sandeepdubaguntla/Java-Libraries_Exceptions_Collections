package creating_File_Programs;

import java.io.File;

public class CreateFolder_InFiles {
	public static void main(String[] args) {
		File f= new File("D://FileHandling");
		System.out.println(f.mkdir());
		
	}
}
