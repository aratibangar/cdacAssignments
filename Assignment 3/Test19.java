/*Snippet 19:
public class Main {
public static void main(String[] args) {
int a = 10;
int b = 0;
int result = a / b;
System.out.println(result);
}
}
 What runtime exception is thrown? Why does division by zero cause an issue in Java?
- Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Main.main(Test19.java:18)
		
 Why does division by zero cause an issue in Java?
--------------------------------------------------
*/

//Correct Program
class Main {
public static void main(String[] args) {
int a = 10;
int b = 0;
int result = a / b;
System.out.println(result);
}
}
