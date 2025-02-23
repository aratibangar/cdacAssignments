/*Snippet 13:
public class Main {
public static void main(String[] args) {
String str = null;
System.out.println(str.length());
}
}
 What exception is thrown? Why does it occur?
Exception in thread "main" java.lang.NullPointerException
        at Main.main(Test13.java:13)
		
- because null is a special literal but if we add in inverted coma it became a string
*/

//Correct Program
class Main {
public static void main(String[] args) {
String str = "null";
System.out.println(str.length());
}
}