/*Snippet 6:
public class Main {
public static void main(String[] args) {
int x = y + 10;
System.out.println(x);
}
}
 What error occurs? Why must variables be declared?
 error: cannot find symbol
int x = y + 10;
        ^
  symbol:   variable y
  location: class Main
  
  -Why must variables be declared?
  - it will help compiler for check right type value will be assign  and it will hold the value of variable and without value addition is not process.
*/


// Correct code
class Main {
public static void main(String[] args) {
	int y = 1;
int x = y + 10;
System.out.println(x);
}
}
