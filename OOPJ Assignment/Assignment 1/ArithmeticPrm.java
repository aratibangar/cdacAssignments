//2. Write a Java program that takes two integers as input and performs all arithmetic
operations on themimport java.util.*;
class ArithmeticPrm{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
	
	int add = num1 + num2;
	int sub = num1 - num2;
	int mult = num1 * num2;
	int div = num1 / num2;
	System.out.println("Add : "+add);
	System.out.println("Sub : "+sub);	
	System.out.println("Mul : "+mult);	
	System.out.println("Div : "+div);
	
 }	
 
}