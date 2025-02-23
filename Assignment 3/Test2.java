/*Snippet 2:
public class Main {
static void main(String[] args) {
System.out.println("Hello, World!");
}
}*/
/* When compile program it is compile properly without error but when i run the code it give an error following:
	Error: Main method not found in class Main, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
*/

//Correct Code
class Main {
public static void main(String[] args) {
System.out.println("Hello, World!");
}
}
