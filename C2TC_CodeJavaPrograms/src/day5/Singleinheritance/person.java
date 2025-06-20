package day5.Singleinheritance;

public class person {
	private int id;
	private String name;
	private String City;
	public person() {
		this.id=101;
		this.name="sameera";
		this.City="chennai";
	}
	public person(int id, String name,String city) {
		this.id=id;
		this.name=name;
		this.City=city;
	}
	public int getId() {
		return id;
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
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + ", City=" + City + "]";
	}
	

}
