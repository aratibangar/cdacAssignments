/*Snippet 6:
public class MisplacedForLoopBody {
public static void main(String[] args) {
for (int i = 0; i < 5; i++)
System.out.println(i);
System.out.println("Done");
}
}
// Error to investigate: Why does "Done" print only once, outside the loop? How should the loop body be enclosed to
include all statements within the loop?
	- Because for loop with no parenthesis only print one statement after the for loop. it does not take  more than one statement when no parenthesis is there
	- when use curly braces to for loop and include statement in that braces it will print when for loop condition is true statement will print.
*/

//Correct code
class Demo {
public static void main(String[] args) {
for (int i = 0; i < 5; i++)
System.out.println(i);
System.out.println("Done");
}
}