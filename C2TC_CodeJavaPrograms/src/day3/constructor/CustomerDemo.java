package day3.constructor;

public class CustomerDemo {
	public static void main(String [] args) {
		  Customer ct = new Customer();
		  ct.setCusId (101);
		  ct.setCusName("john");
		  ct.setCusCity("chennai");
		  System.out.println(ct);
		  Customer ct1 = new Customer();
		  ct1.setCusId (102);
		  ct1.setCusName("jack");
		  ct1.setCusCity("chennai");
		  System.out.println(ct1);
		 
	}


}
