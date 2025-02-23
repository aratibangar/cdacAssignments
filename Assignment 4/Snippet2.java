/*Snippet 2:
public class IncorrectWhileCondition {
public static void main(String[] args) {
int count = 5;
while (count = 0) {
System.out.println(count);
count--;
}
}
}
// Error to investigate: Why does the loop not execute as expected? What is the issue with the condition in the
`while` loop?
	-  incompatible types: int cannot be converted to boolean
while (count = 0) {
	- In while statement condition have to change to count greater than 0 and in print statement add + sign before variable for print the output
*/
	

//Correct Code
class Demo {
public static void main(String[] args) {
int count = 5;
while (count >= 0) {
System.out.println(+count);
count--;
}
}
}