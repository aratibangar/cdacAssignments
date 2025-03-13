
import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's percentage: ");
        double percentage = scanner.nextDouble();
        scanner.close();

        System.out.println(percentage >= 40 ? "Pass" : "Fail");
    }
}