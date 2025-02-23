import java.util.*;

class Demo{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = num.nextInt();
		System.out.println("Enter the second Number");
		int num2 = num.nextInt();
		System.out.println("Enter the Third Number");
		int num3 = num.nextInt();
		if(num1>num2 && num1>num3){
			System.out.println("The largest number is " +num1);
		}else if(num2>num1 && num2>num3){
			System.out.println("The largest number is " +num2);
		}else{
			System.out.println("The largest number is " +num3);
		}
	}
}