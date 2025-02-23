/*Snippet 3:
public class Main {
public static int main(String[] args) {
System.out.println("Hello, World!");
return 0;
}*/
/*  When compile program it is compile properly without error but when i run the code it give an error following:
	Error: Main method must return a value of type void in class Main, please
define the main method as:
   public static void main(String[] args)
   2. void doesn't give any return type
*/

//correct Code
class Main {
public static void main(String[] args) {
System.out.println("Hello, World!");
}
}
