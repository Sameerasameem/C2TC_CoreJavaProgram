package day3;

public class Person {
	private int age;
	private String name;
	private String gender;
	private int income;
	private int tax;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
   @Override
public String toString() {
	return "Person [age=" + age + ", name=" + name + ", gender=" + gender + ", income=" + income + ", tax=" + tax
			+ ", getAge()=" + getAge() + ", getName()=" + getName() + ", getGender()=" + getGender() + ", getIncome()="
			+ getIncome() + ", getTax()=" + getTax() + "]";
}
}
