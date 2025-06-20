package day4.firstpackage;

public class StudententityDemo {
	public static void main(String [] args) {
		Studententity st = Studententity.getObj();
		st.setId(101);
		st.setName("sameera");
		
		Studententity st1 = Studententity.getObj();
		System.out.println(st);
		System.out.println(st1);
		
	}

}
