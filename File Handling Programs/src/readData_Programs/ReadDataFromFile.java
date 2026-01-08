package readData_Programs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromFile {
	public static void main(String[] args) {
//		try {
//			FileReader fr = new FileReader("Abc.txt");
//			long length = new File("Abc.txt").length();
//			for(int i=0;i<length;i++) {
//				System.out.print((char)fr.read());
//			}
//			fr.close();
//		} catch (FileNotFoundException e) {
//			System.out.println("File Not Created, can not read the data...");
//		} catch (IOException e) {
//			System.out.println("Please Close the file and then Rum the code...");
//		}
//	 This Process is not Efficient because of looping Statements, so we go for bufferedReader.	
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("Abc.txt"));
			String res=br.readLine();
			// Even In Buffered Reader through readLine() method we can only read single line
			System.out.println(res);
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
