package readData_Programs;

import java.io.BufferedReader;
//import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadData_PrintDataWithOperations {
	public static void main(String[] args) {
//		File f = new File("MS15//Qsp.txt");
//		File f1 = new File("MS13//jsp.txt");
//		f.mkdir();
//		try {
//			System.out.println(f.createNewFile());
//			System.out.println(f1.createNewFile());
//		} catch (IOException e) {
//			System.out.println("Handled...");
//		}
		
		try {
			BufferedReader br =new BufferedReader(new FileReader("MS13//jsp.txt"));
			String res = br.readLine();
			String rev="";
			for(int i=res.length()-1;i>=0;i--) {
				rev=rev+res.charAt(i);
			}
			System.out.println(rev);
			br.close();
			
			BufferedReader br1=new BufferedReader(new FileReader("MS15//Qsp.txt"));
			String str = br1.readLine();
			String result="";
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
					result = result + str.charAt(i);
				}
			}
			System.out.println(result);
			br1.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not Created , can not read data...");
		} catch (IOException e) {
			System.out.println("Please Close the file and then Run the program.");
		}
		
	}
}
