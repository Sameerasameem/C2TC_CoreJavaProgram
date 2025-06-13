package day1;

public class PrimitiveDataType {
	public static void main(String [] args) {
		byte byteMax = 127;
		byte byteMin = -128;
		System.out.println("max range of byte is:" + byteMax +"min range of byte is:" + byteMin);
		short shortMax = 32767;
		short shortMin = -32768;
		System.out.println("maxshort range of byte is:" + shortMax +"minshort range of byte is:" + shortMin);
		int MaxInt = 2147483647;
		int MinInt = -2147483648;
		System.out.println("max range of int is:" + MaxInt +"min range of int is:" + MinInt);
		long MaxLong = 9223372036854775807L;
		long MinLong = -9223372036854775808L;		
		System.out.println("max range of long is:" + MaxLong +"min range of long is:" + MinLong);
		
	}
}