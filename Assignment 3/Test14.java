/*Snippet 14:
public class Main {
public static void main(String[] args) {
double num = "Hello";
System.out.println(num);
}
}
 What compilation error occurs? Why does Java enforce data type constraints?
 error: incompatible types: String cannot be converted to double
double num = "Hello";

- Why does Java enforce data type constraints?
-   -------------------------
*/

//Correct Program
class Main {
public static void main(String[] args) {
String num = "Hello";
System.out.println(num);
}
}