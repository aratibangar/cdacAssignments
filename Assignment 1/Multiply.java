import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = num.nextInt();
        System.out.print("Enter second number: ");
        int num2 = num.nextInt();
        int result = num1 * num2;
        System.out.println("The product of 2 number is : " + result);
    }
}
