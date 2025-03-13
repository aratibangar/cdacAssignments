/*Implement a Java program that checks if a number is within a specific range (20 to
50) without using if-else. Hint: Use logical AND (&&) in a print statement.*/

import java.util.*;

class Rangeif{
	public static void main(String args[]){
		System.out.println("Enter the Number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(num + " is in range (20 to 50): " + (num >= 20 && num <= 50));
		/*if(num>=20 && num<=50){
			System.out.println("Number is Between 20 & 50");
		}else{
			System.out.println("Number is Not Between 20 & 50");
		}*/
	}
}