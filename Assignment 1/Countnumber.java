//Countnumber.java
import java.util.*;

class Demo{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the numbers");
		long n = num.nextLong();
		int count =String.valueOf(Math.abs(n)).length();
		System.out.println("Length of number is : " +count);
		
		
	}
}