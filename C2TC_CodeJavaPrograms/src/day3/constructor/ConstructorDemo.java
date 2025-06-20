package day3.constructor;

import java.util.Scanner;

public class ConstructorDemo {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int id;
		String name ,city;
		System.out.print("Enter Customer Id : ");
		id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Customer Name : ");
		name=sc.nextLine();
		System.out.print("Enter Customer City : ");
		city=sc.nextLine();

		System.out.println("");
		Customer c1=new Customer(); //default constructor invoked
		c1.setCusName(name);
		c1.setCusId(id);
		c1.setCusCity(city);
		System.out.print("Enter Customer Id : ");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter Customer Name : ");
		name=sc.nextLine();
		System.out.print("Enter Customer City : ");
		city=sc.nextLine();
		 System.out.println(c1);
		 sc.close();
		 
		 
		
		
		
	}
	  
}
