/*Q22: Implement a calculator that takes two numbers and an operator (+, -, *, /) as input and prints the result using only switch-case.*/

import java.util.*;
class CalculatorSwitch{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a = sc.nextInt();
		System.out.println("Enter the Second Number");
		int b = sc.nextInt();
		System.out.println("Enter the Operator +, -, * , / ");
		char x = sc.next().charAt(0);
		
		switch(x){
			case '+': 
				System.out.println("Addition of "+a+" + "+b+" is : "+(a+b));
				break;
			case '-': 
				System.out.println("Substraction of "+a+" - "+b+" is : "+(a-b));
				break;
			case '*': 
				System.out.println("Multiplication of "+a+" * "+b+" is : "+(a*b));
				break;
			case '/': 
				System.out.println("Division of "+a+" / "+b+" is : "+(a/b));
				break;
		}
	}
}