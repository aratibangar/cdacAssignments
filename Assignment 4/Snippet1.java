/*
Snippet 1:
public class InfiniteForLoop {
public static void main(String[] args) {
for (int i = 0; i < 10; i--) {
System.out.println(i);
}
}
}
// Error to investigate: Why does this loop run infinitely? How should the loop control variable be adjusted?
	- because condition say value should be less than 10 and decrement therefor no termination condition is there thats why it was go to infinetly.
	-in decrement condition just add increment the loop goes perfectly run.
*/

//Correct Code
class InfiniteForLoop {
public static void main(String[] args) {
for (int i = 0; i < 10; i++) {
System.out.println(i);
}
}
}