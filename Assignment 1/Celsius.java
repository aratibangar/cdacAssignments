//Celsius.java

import java.util.*;

class Demo{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the Celsius Temprature");
		int celsius = num.nextInt();
		double fahrenheit = (celsius * 9/5) + 32;
		System.out.println(celsius+ "C is equal to " +fahrenheit+ "F ");
		
	}
}