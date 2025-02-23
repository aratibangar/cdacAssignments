import java.util.*;

class Demo{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = num.nextInt();
		int fact = 1;
		for(int i=1; i<=n; i++){
			fact *= i;
		}
		System.out.println("Factorial of " + n + " is " +fact);
	}
}