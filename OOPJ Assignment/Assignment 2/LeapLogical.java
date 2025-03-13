//Implement a Java program that checks whether a given year is a leap year or not using logical (&&, ||) operators

import java.util.*;
class LeapLogical{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Year");
		int year = sc.nextInt();
		if(year%4==0 && year%400 == 0 || year%100 != 0){
			System.out.println("The Year "+year+" is Leap Year");	
		}else{
			
			System.out.println("The Year "+year+" is not Leap Year");
		}
		
	}
}