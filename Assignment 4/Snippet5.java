/*Snippet 5:
public class WrongInitializationForLoop {
public static void main(String[] args) {
for (int i = 10; i >= 0; i++) {
System.out.println(i);
}
}
}
// Error to investigate: Why does this loop not print numbers in the expected order? What is the problem with the
initialization and update statements in the `for` loop?
	- because i initialize as 10 and give condition i is >= 0 and value of i will be increment thats why there is infinite time execute the value of i because value of i is always greater than 0 if we add decrementation of i then value of i is decrement and if value of i becomes less that zero for loop will exit and print value from  10 to 0.
*/

//Correct code
class Demo {
public static void main(String[] args) {
for (int i = 10; i >= 0; i--) {
System.out.println(i);
}
}
}