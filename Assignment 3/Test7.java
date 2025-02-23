/*Snippet 7:
public class Main {
public static void main(String[] args) {
int x = "Hello";
System.out.println(x);
}
}
 What compilation error do you see? Why does Java enforce type safety?
- Java enforces type safety to improve program correctness, reliability, and maintainability
- 
*/

/*
error: incompatible types: String cannot be converted to int
int x = "Hello";
*/

//Correct Program
class Main {
public static void main(String[] args) {
String x = "Hello";
System.out.println(x);
}
}