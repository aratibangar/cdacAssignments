/*Snippet 9:
public class InfiniteForLoopUpdate {
public static void main(String[] args) {
for (int i = 0; i < 5; i += 2) {
System.out.println(i);
}
}
}
// Error to investigate: Why does the loop print unexpected results or run infinitely? How should the loop update
expression be corrected?
	- loop run properly and shows output of even numbers because we increment +2 time. if we have serial number output we just add 1 instead of 2.
*/

//Correct code
class Demo {
public static void main(String[] args) {
for (int i = 0; i < 5; i += 2) {
System.out.println(i);
}
}
}