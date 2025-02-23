import java.util.*;

class Demo{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the number for Multipliication table");
		int num1 = num.nextInt();
		System.out.println("Multiplication table of " +num1);
		for(int i=1; i<=10; i++){
			//int result = num1 * i;
			//System.out.println(num1+ " * " +i+ " = " +result);
			
			System.out.println(num1+ " * " +i+ " = " +(num1 * i));
		}
	}

}