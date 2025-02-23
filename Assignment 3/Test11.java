/*Snippet 11:
public class Main {
public static void main(String[] args) {
int[] arr = {1, 2, 3};
System.out.println(arr[5]);
}
}
 What runtime exception do you encounter? Why does it occur?

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        at Main.main(Test11.java:14)
		- Error will be occur because assign value to array will be 3 and in program will be written to show output of 5 index from array thats why it show out of array value
*/

//Correct Program
class Main {
public static void main(String[] args) {
int[] arr = {1, 2, 3};
System.out.println(arr[2]);
}
}