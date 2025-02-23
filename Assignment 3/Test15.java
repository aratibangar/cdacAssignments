/*Snippet 15:
public class Main {
public static void main(String[] args) {
int num1 = 10;
double num2 = 5.5;
int result = num1 + num2;
System.out.println(result);
}
}
 What error occurs when compiling this code? How should you handle different data types
in operations?
	error: incompatible types: possible lossy conversion from double to int
int result = num1 + num2;
 How should you handle different data types in operations?
	- Using type Conversion from just add int in bracket before num2

*/

//Correct Program
class Main {
public static void main(String[] args) {
int num1 = 10;
double num2 = 5.5;
int result = num1 + (int)num2;
System.out.println(result);
}
}