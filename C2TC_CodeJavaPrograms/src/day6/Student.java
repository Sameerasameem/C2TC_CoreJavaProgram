package day6;

public class Student {
	private String sname;
	private static int id;
	private int reg;
	private final static int x;
	static {
		System.out.println("losu");
	}
	public Student() {
		id++;
		reg++;
		System.out.println("Constructor called");
	}
	
	
	public int getReg() {
		return reg;
	}


	public void setReg(int reg) {
		this.reg = reg;
	}


	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Student.id = id;
	}
	@Override
	public String toString() {
		return "Student [id:"+id+" reg:"+reg+" sname=" + sname + "]";
	}
	

}
