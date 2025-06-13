package day1;
import java.lang.System;
import java.util.Scanner;
public class ScannerProgram {
	public static void main(String args[]) {
		Scanner sc;
		int a,b,c;
		sc = new Scanner(System.in);
		System.out.println("Enter a:");
		a = sc.nextInt();
		System.out.println("Enter b:");
		b = sc.nextInt();
		c=a+b;
		System.out.println("Addition of a= "+a+" and b="+b+" is"+c);
		
		
	}

}
