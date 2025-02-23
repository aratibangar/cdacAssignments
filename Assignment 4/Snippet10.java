/*Snippet 10:
public class IncorrectWhileLoopControl {
public static void main(String[] args) {
int num = 10;
while (num = 10) {
System.out.println(num);
num--;
}
}
}
// Error to investigate: Why does the loop execute indefinitely? What is wrong with the loop condition?
 incompatible types: int cannot be converted to boolean
while (num = 10) {
	- in code we define varible and condition is same thats why loop is not execute in while loop condition just assign value to variable thats why it gives error
*/

//Correct Code
class Demo {
public static void main(String[] args) {
int num = 10;
while (num >= 0) {
System.out.println(num);
num--;
}
}
}