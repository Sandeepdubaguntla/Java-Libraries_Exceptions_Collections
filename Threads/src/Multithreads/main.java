package Multithreads;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Entre the number: ");
		int num=sc.nextInt();
		Even_or_odd t = new Even_or_odd(num);
		t.start();
		pallindrome p = new pallindrome(num);
		p.start();
	}
}
