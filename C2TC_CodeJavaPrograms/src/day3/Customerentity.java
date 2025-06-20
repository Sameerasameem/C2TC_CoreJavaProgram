package day3;

public class Customerentity {
	private int id;
	private String name;
	private String city;
	public int getId() {
		return id;
	}
	public Customerentity(){
		this.id=101;
		this.name ="sameera";
		this.city = "chennai";
	}
	public Customerentity(int id,String name,String city) {
		this.id=id;
		this.name=name;
		this.city=city;
		
	}
	public Customerentity(int id,String name) {
		this.id=id;
		this.name=name;
		
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customerentity [id=" + id + ", name=" + name + ", city=" + city + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getCity()=" + getCity() + "]";
	}
	

}
