package day4.thirdpackage;

public class PrivateConstructorDemo {
    public static void main(String [] args) {
    	Myclass m = Myclass.getObj();
    	m.setId(10);
    	Myclass m1 = Myclass.getObj();
    	System.out.println(m);
    	System.out.println(m1);
    	}
}
