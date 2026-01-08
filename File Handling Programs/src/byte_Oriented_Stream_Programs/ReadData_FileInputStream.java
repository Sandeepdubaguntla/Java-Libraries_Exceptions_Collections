package byte_Oriented_Stream_Programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadData_FileInputStream {
	public static void main(String[] args) {
		try {
			FileInputStream fis =new  FileInputStream("File.txt");
			long length = new File("File.txt").length();
			for(int i=0;i<length;i++) {
				System.out.print((char)fis.read());
			}
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("Handled....");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

		
}
