package readData_Programs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadData_PrintSumOfData {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("Abc.txt");
			BufferedReader br =new BufferedReader(fr);
			String res = br.readLine();
			long num = Integer.parseInt(res);
			long sum=0;
			while(num>0) {
				long ld=num%10;
				sum=sum+ld;
				num=num/10;
			}
			System.out.println(sum);
			br.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("File not created, cannot read the data...");		
			} 
		catch (IOException e) {
			System.out.println("Please close the file and then RUn the program...");
		}
	}
}
