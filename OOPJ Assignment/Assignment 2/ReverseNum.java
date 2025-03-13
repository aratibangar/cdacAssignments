/*Q25: Implement a program that reverses an integer number without using string conversion (StringBuilder or toCharArray) 
Hint: Use while(n!=0) { rev = rev * 10 + n % 10; n /= 10; }*/

import java.util.*;
class ReverseNum{
	public static void main(String args[]){
		int a = 12345, reverse =0;
		while(a!=0){
			int num = a%10;
			reverse = reverse * 10 + num;
			  a /= 10;
		}
			System.out.println("Reverse is : "+reverse);
		
	}

}