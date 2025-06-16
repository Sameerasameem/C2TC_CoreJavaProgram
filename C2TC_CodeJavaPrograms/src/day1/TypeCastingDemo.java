package day1;

public class TypeCastingDemo {
	public static void main(String [] args) {
		byte b = 10;
		int i = b;
		System.out.println(i);
		
		float f = 12.3f;
		double d = f;
		System.out.println(d);
		
		char ch = 'A';
		int i4 = ch;
		System.out.println(i4);
		 
		char var1 = '\u00A7';
		int i5 = var1;
		System.out.println();
		
		double f1 = 10.52f;
		long l = (long) f1;
		System.out.println(l);
		
		long l2 = 923372036854775806l;
		int i9 =(int) l2;
		System.out.println(i4);
		
		float f3 = 123.78f;
		int i6 =(int) f3;
		System.out.println(i6);
		
		byte b5 = 18;
		char ch4 =(char)b5;
		System.out.println(ch4);
		
	}
}
