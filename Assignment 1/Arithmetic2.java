import java.util.Scanner;

class Demo{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = num.nextInt();
		System.out.println("Enter First Number");
		int num2 = num.nextInt();
		int add = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		int rem = num1 % num2;
		System.out.println("Addition of numbers is : " +add);
		System.out.println("Subbstraction of numbers is : " +sub);
		System.out.println("Multiplication of numbers is : " +mul);
		System.out.println("Divison of numbers is : " +div);
		System.out.println("Remainder of numbers is : " +rem);
		
		
		
	}
}