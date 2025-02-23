/*Snippet 20:
public class Main {
public static void main(String[] args) {
System.out.println("Hello, World")
}
}
 What syntax error occurs? How does the missing semicolon affect compilation?
 error: ';' expected
System.out.println("Hello, World")
                                  ^
 How does the missing semicolon affect compilation?
- it affect on compilation because compiler doesnot not know termination of statement.
*/

//Correct Program
class Main {
public static void main(String[] args) {
System.out.println("Hello, World");
}
}