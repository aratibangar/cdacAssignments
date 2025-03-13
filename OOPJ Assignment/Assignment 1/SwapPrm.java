//Write a Java program to swap two numbers using a temporary variable and without using a temporary variable.

class SwapPrm{
	public static void main(String args[]){
		int a=20, b=10;
		System.out.println("a : "+a+" b : "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a : "+a+" b : "+b);
		int m=20, n=30;
		System.out.println("m : "+m+" n : "+n);
		int c=m;
		m=n;
		n=c;
		System.out.println("m : "+m+" n : "+n);
	}
}