package day4.firstPackage;

public class Base {
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	void methodDefault() {
		System.out.println("Default access Base Class");
		System.out.println("Default varaible :" + varDefault);
		
	}
	public void methodPublic() {
		System.out.println("Public access Base Class");
		System.out.println("Public varaible :" + varPublic);
		
	}
	private void methodPrivate() {
		System.out.println("Private access Base Class");
		System.out.println("Private varaible :" + varPrivate);
		
	}
	protected void methodProtected() {
		System.out.println("Protected access Base Class");
		System.out.println("Protected varaible :" + varProtected);
		
	}
	
	
	

}
