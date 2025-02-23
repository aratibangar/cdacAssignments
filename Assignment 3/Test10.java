/*
Snippet 10:
public class Main {
public void display() {
System.out.println("No parameters");
}
public void display(int num) {
System.out.println("With parameter: " + num);
}
public static void main(String[] args) {
display();
display(5);
}
}
 What happens when you compile and run this code? Is method overloading allowed?

error: non-static method display() cannot be referenced from a static context
display();
^
error: non-static method display(int) cannot be referenced from a static context
display(5);

- Is method overloading allowed?
- Yes method overloading is allow.
*/

//Correct Code
class Main {
public static void display() {
System.out.println("No parameters");
}
public static void display(int num) {
System.out.println("With parameter: " + num);
}
public static void main(String[] args) {
display();
display(5);
}
}