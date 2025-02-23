/*Snippet 12:
public class LoopVariableScope {
public static void main(String[] args) {
for (int i = 0; i < 5; i++) {
int x = i * 2;
}
System.out.println(x); // Error: 'x' is not accessible here
}
}
// Error to investigate: Why does the variable 'x' cause a compilation error? How does scope
	- because x is define inside the for block and access for print outside the for loop thats why it is not access.
	for the result we have to print statement add inside the for loop or have to declare x outside of for loop
*/

//Correct code
class Demo {
public static void main(String[] args) {
for (int i = 0; i < 5; i++) {
int x = i * 2;
System.out.println(x);
}
}
}