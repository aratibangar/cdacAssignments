//4.Create a Java program that converts a given integer to a double and vice versa using wrapper classes

class WrapperPrm{
	public static void main(String args[]){
		int i =10;
		double d = i;
		System.out.println("int to double : "+i);
		double d1 = 100.0895483760;
		int i1 = (int) d1;
		System.out.println("Double to int : "+i1);
	}
}