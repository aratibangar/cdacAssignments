/*Snippet 21:
public class Main {
public static void main(String[] args) {
System.out.println("Hello, World!");
// Missing closing brace here
}
 What does the compiler say about mismatched braces?
 error: reached end of file while parsing
}
*/

//Correct Program
class Main {
public static void main(String[] args) {
System.out.println("Hello, World!");
// Missing closing brace here
}
}