/*Snippet 4:
public class Main {
public static void main() {
System.out.println("Hello, World!");
}
}
 What happens when you compile and run this code? Why is String[] args needed?

*/

/*
Error: Main method not found in class Main, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
*/

//Correct Code
class Test4 {
public static void main() {
System.out.println("Hello, World!");
}
}