package creating_File_Programs;

import java.io.File;

public class CreateFolder {
	public static void main(String[] args) {
		File f = new File("folder");
		boolean res = f.mkdir();
		System.out.println(res);
	}
}
