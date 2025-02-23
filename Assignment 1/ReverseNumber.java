//ReverseNumber.java
import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = num.nextInt();

        int reverse = 0;
        while (n != 0) {
            int digit = n % 10; 
            reverse = reverse * 10 + digit; 
            n /= 10;  
        }

        System.out.println("Reversed number: " + reverse);
    }
}
