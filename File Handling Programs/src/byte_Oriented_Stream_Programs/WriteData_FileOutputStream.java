package byte_Oriented_Stream_Programs;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.util.Arrays;

public class WriteData_FileOutputStream {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("File.txt");
			String s = "ABCD";
			byte[] b = s.getBytes();
//			System.out.println(Arrays.toString(b));
			fos.write(b);
			fos.flush();
			fos.close();
			System.out.println("Stored Successfully...");
		} catch (FileNotFoundException e) {
			System.out.println("Handled....");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
