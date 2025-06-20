package day4.thirdpackage;

public class Myclass {
	private static Myclass obj = new Myclass();
	private int id;
	public static Myclass getObj() {
		return obj;
	}
	public static void setObj(Myclass obj) {
		Myclass.obj = obj;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Myclass [id=" + id + "]";
	}
	

}
