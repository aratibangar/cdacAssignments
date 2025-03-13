/*Q20: Implement a Java program that returns the absolute value of a given number using the ternary operator (without using Math.abs()).*/

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int absValue = (num < 0) ? -num : num;  // Ternary operator for absolute value

        System.out.println("Absolute value: " + absValue);
    }
}
