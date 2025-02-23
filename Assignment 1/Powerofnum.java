//Powerofnum.java
import java.util.*;

class Demo{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the base : ");
		double base = num.nextDouble();
		System.out.print("Enter the exponent : ");
		double expo = num.nextDouble();
		double result = Math.pow(base, expo);
		System.out.println("Power of " +base+ "^" +expo+ " is : "+result);
	}
}