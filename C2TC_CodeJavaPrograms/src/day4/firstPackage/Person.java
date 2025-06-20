package day4.firstPackage;

public class Person {
	private String name;
	private int age;
	private String city;
	public Person() {
		System.out.println("Default Constructor");
		this.age=23;
		this.name="sameera";
		this.city="chennai";

		
	}
	public Person(String name, int age, String city) {
		System.out.println("Parameterized Constructor");
		this.age=age;
		this.name=name;
		this.city=city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	

}
