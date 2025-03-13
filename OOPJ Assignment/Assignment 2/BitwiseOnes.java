/*Q14: Write a program to count the number of 1s (set bits) in a binary representation of a
number using bitwise operations.
Hint: Use n & (n - 1).*/
import java.util.*;

public class BitwiseOnes{
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
		int count = 0;
		while(num > 0){
            num = (num & (num - 1));
            count++;
        }
		System.out.println(count);
	}
	
	
}	

// 0111 0110 
// 0110 1
// 0110 0101 
// 0100 2
// 0100 0011
// 0000 3


