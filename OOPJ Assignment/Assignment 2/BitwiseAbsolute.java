/*Q13: Implement a Java program to find the absolute value of an integer using bitwise operators. 
Hint: mask = num >> 31; abs = (num + mask) ^ mask;*/

import java.util.Scanner;

class BitwiseAbsolute{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
		int mask = num >> 31; 
		int abs = - ~mask;
		System.out.println(abs);
		
	}
	

}	

// 00000000 00000000 00000000 00010100
// 11111111 11111111 11111111 11101011
// 11111111 11111111 11111111 11101100  
// 11111111 11111111 11111111 11111111
// 00000000 00000000 00000000 00010101
// 11111111 11111111 11111111 11101010

// 11111111 11111111 11111111 11101011
// 11111111 11111111 11111111 11111111
// 00000000 00000000 00000000 00010100
