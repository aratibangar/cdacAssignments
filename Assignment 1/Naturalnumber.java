import java.util.*;

class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("First " + n + " natural numbers:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}