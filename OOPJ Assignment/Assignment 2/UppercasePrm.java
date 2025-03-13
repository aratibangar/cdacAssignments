/*Q19: Write a Java program that checks whether a character is uppercase, lowercase, or not a letter using only the ternary operator.*/

import java.util.*;
class UppercasePrm{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
			char ch = sc.next().charAt(0);
			System.out.println((ch>='A' && ch<='Z')?"Uppercase":(ch>='a' && ch<='z')?"Lowercase":"Number");
	}
}