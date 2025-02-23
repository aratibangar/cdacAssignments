/*Snippet 24:
public class MissingBreakCase {
public static void main(String[] args) {
int level = 1;
switch(level) {
case 1:
System.out.println("Level 1");
case 2:
System.out.println("Level 2");
case 3:
System.out.println("Level 3");
default:
System.out.println("Unknown level");
}
}
}
 Error to Investigate: When level is 1, why does it print "Level 1", "Level 2", "Level 3", and
"Unknown level"? What is the role of the break statement in this situation?

- Because there is not break statement thats why all case statement run and print output. if break statement is there then after run it directly come out from switch statement
*/

//Correct Program
class Main {
public static void main(String[] args) {
int level = 1;
switch(level) {
case 1:
System.out.println("Level 1");
case 2:
System.out.println("Level 2");
case 3:
System.out.println("Level 3");
default:
System.out.println("Unknown level");
}
}
}