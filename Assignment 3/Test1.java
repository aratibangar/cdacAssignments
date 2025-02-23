/*Snippet 1: Error Code
public class Main {
public void main(String[] args) {
System.out.println("Hello, World!");
}
}
  When compile program it is compile properly without error but when i run the code it give an error following:
	Error: Main method is not static in class Main, please define the main method as:
   public static void main(String[] args)
*/

//Correct Code
class Main {
public static void main(String[] args) {
System.out.println("Hello, World!");
}
}
