package writeData_Programs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCharacterData {
	public static void main(String[] args){
		File f= new File("D://JspFolder//jsp.doc");
//		boolean res = f.mkdir();
//		System.out.println(res);
		try {
			System.out.println(f.createNewFile());
		} catch (IOException e) {
			System.out.println("Handled");
		}
		
		try {
			FileWriter fr = new FileWriter(f,true);
			String str = "java";
			fr.write(str);
			fr.flush();
			fr.close();
		} catch (IOException e) {
			System.out.println("Handled..");
		}
			
		System.out.println("Data Stored Successfully...");
	}
}
