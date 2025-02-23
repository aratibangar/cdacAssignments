/*Snippet 4:
public class Main {
public static void main() {
System.out.println("Hello, World!");
}
}
 What happens when you compile and run this code? Why is String[] args needed?

*/

/*  When compile program it is compile properly without error but when i run the code it give an error following:
Error: Main method not found in class Main, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

Why is String[] args needed?
	- String[] args is an array of String objects that represents command-line arguments passed to the Java program when it is executed.
	-The args array allows users to pass input data to the program at runtime.
*/

//Correct Code
class Test4 {
public static void main(String args[]) {
System.out.println("Hello, World!");
}
}