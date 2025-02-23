/*Snippet 4:
public class OffByOneErrorForLoop {
public static void main(String[] args) {
for (int i = 1; i <= 10; i++) {
System.out.println(i);
}
// Expected: 10 iterations with numbers 1 to 10
// Actual: Prints numbers 1 to 10, but the task expected only 1 to 9
}
}
// Error to investigate: What is the issue with the loop boundaries? How should the loop be adjusted to meet the
expected output?
	- in condition if we add i<=10 then it execute the condition less than and equal times of that condition.
	- if we remove equal to sign it will show output as expected
*/

//Correct Code
class Demo {
public static void main(String[] args) {
for (int i = 1; i < 10; i++) {
System.out.println(i);
}
// Expected: 10 iterations with numbers 1 to 10
// Actual: Prints numbers 1 to 10, but the task expected only 1 to 9
}
}