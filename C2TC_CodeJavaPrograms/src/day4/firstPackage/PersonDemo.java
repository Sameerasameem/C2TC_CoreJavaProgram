package day4.firstPackage;

public class PersonDemo {
	public static void main(String args[]) {
		Person p1 = new Person(); // default constructor invoked
        System.out.println(p1);

		 
		p1 = new Person("samee",23,"chennai"); // parameterized constructor invoked);
		System.out.println("Name :"+ p1.getName() + "  Age :"+ p1.getAge() + "\tCity : "
				+ p1.getCity());
		 

	}
}