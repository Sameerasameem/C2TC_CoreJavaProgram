package day4.firstpackage;

public class Studententity {
	private static Studententity obj = new Studententity();
	
	public static Studententity getObj() {
		return obj;
	}
	private int id;
	private String name;

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
	@Override
	public String toString() {
		return "Studententity [id=" + id + ", name=" + name + ", getId()=" + getId() + ", getName()=" + getName() + "]";
	}
	public Studententity() {
		super();
	 
	}
	
	

}
