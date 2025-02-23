/*Snippet 5:
public class Main {
public static void main(String[] args) {
System.out.println("Main method with String[] args");
}
public static void main(int[] args) {
System.out.println("Overloaded main method with int[] args");
}
}
 Can you have multiple main methods? What do you observe?
- yes have multiple main methods but their parameter types has been differents. and 
- program is compile and run and show the output of first print line
*/
// program is compile and run and show the output of first System.out.println("Main method with String[] args") 

//Correct Program
class Main {
public static void main(String[] args) {
System.out.println("Main method with String[] args");
}
public static void main(int[] args) {
System.out.println("Overloaded main method with int[] args");
}
}