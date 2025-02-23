/*Snippet 17:
public class Main {
public static void main(String[] args) {
int a = 10;
int b = 5;
int result = a ** b;
System.out.println(result);
}
}
 What compilation error occurs? Why is the ** operator not valid in Java?

 error: illegal start of expression
int result = a ** b;
	- ** operator is not valid because Java does not support exponentiation
*/

//Correct Program
class Main {
public static void main(String[] args) {
int a = 10;
int b = 5;
int result = a * b;
System.out.println(result);
}
}