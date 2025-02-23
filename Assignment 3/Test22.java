/*Snippet 22:
public class Main {
public static void main(String[] args) {
static void displayMessage() {
System.out.println("Message");
}
}
}
 What syntax error occurs? Can a method be declared inside another method?
 error: illegal start of expression
static void displayMessage() {
^
error: class, interface, or enum expected

- No , method can not be declared inside another method
}
*/

//Correct Program
class Main {
public static void main(String[] args) {
static void displayMessage() {
System.out.println("Message");
}
}
}