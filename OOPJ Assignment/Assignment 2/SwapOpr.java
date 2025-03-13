//Q5: Write a Java program to swap two numbers using the += and -= operators only.

class SwapOpr{
	public static void main(String args[]){
		int a = 20, b = 10;
		System.out.println("a : " + a + " b : " + b);
		a += b;
		b = a - b;
		a -= b;	
		System.out.println("a : " + a + " b : " + b);
		
		
		  
	}
}