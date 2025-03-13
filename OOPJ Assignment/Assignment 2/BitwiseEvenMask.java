/*Q15: Implement a program to swap odd and even bits of a number using bitwise operators.
Hint: Use masks: (x & 0xAAAAAAAA) >> 1 | (x & 0x55555555) << 1*/
import java.util.*;

public class BitwiseEvenMask{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        scanner.close();
		int evenBits = (x & 0xAAAAAAAA) >> 1; // Get even bits and shift right
        int oddBits = (x & 0x55555555) << 1;   // Get odd bits and shift left
        int res = (evenBits | oddBits);   
		System.out.println(res);
	}
	
	
}	

// 1001
// 10101010 10101010 10101010 10101010
//                                1001
// 00000000 00000000 00000000 00001000
// 00000000 00000000 00000000 00000100

// 01010101 01010101 01010101 01010101
//                                1001
// 00000000 00000000 00000000 00000001
// 00000000 00000000 00000000 00000010
// 00000000 00000000 00000000 00000010
// 00000000 00000000 00000000 00000100
// 00000000 00000000 00000000 00000110



