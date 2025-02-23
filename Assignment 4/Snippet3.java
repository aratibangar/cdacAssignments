/*Snippet 3:
public class DoWhileIncorrectCondition {
public static void main(String[] args) {
int num = 0;
do {
System.out.println(num);
num++;
} while (num > 0);
}
}
// Error to investigate: Why does the loop only execute once? What is wrong with the loop condition in the `do-
while` loop?
	- In do while loop first statement print then check condition. if condition false it also print statement 1 time.
	- in this program variable initialize as a 0 and gives condition variable is greater than zero and it goes to increment thats why it goes infinite time print varible value. when correct code and just give in condition lesser sign it becomes variable num is less than 0 then condition false.
*/

//Correct code
class Demo {
public static void main(String[] args) {
int num = 0;
do {
System.out.println(num);
num++;
} while (num < 0);
}
}