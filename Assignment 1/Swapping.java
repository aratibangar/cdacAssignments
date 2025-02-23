import java.util.*;

class Demo{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = num.nextInt();
		System.out.println("Enter the second number");
		int num2 = num.nextInt(); 
		System.out.println("First Number : " + num1);
		System.out.println("Second Number : " + num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("First Number : " + num1);
		System.out.println("Second Number : " + num2);
	}
}