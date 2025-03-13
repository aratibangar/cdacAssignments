//3. Implement a Java program to demonstrate implicit and explicit type casting.

class ConvertPrm{
	public static void main(String args[]){
		int a = 10;
		double d = a;
		System.out.println("int " +a);
		System.out.println("int to double " +d);
		
		
		//3.
		
		double douint = 10.00d;
		int b = (int) douint;
		System.out.println("double no " +douint);
		System.out.println("double to int " +b);
	}
	
}