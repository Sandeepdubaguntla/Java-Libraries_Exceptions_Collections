package writeData_Programs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteOnlyUpperCase_FromString {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		File f=new File("folder//Uppercase.txt");
		try {
			System.out.println(f.createNewFile());
		} catch (IOException e) {
			System.out.println("Handled..");
		}
		System.out.println("Enter the String :");
		String str=sc.next();
		String res="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				res=res+str.charAt(i);
			}
			}
		try {
			FileWriter fr = new FileWriter(f);
			
					fr.write(res);
					fr.flush();
					fr.close();
				
				
			
		} catch (IOException e) {
			System.out.println("Handled...");
		}
		System.out.println("Data Stored Successfully..");
		sc.close();
	}
}
