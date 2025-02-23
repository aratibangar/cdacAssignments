import java.util.*;

class Demo{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a = num.nextInt();
		System.out.println("Enter the Second Number");
		int b = num.nextInt();
		System.out.println("Enter the Third Number");
		int c = num.nextInt();
		int result = (a+b+c)/3;
		System.out.println("Average of " + a + " & " + b + " & " + c + " is : " +result);
	}
}