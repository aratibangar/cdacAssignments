/*Snippet 8:
public class OffByOneDoWhileLoop {
public static void main(String[] args) {
int num = 1;
do {
System.out.println(num);
num--;
} while (num > 0);
}
}
// Error to investigate: Why does this loop print unexpected numbers? What adjustments are needed to print the
numbers from 1 to 5?
	- because we assign num value to 1 and decrement it and give condition num is greater than zero even if we increment num then it will print infinte time thats why we have to change condition as well from num greater than zero to num less than equal to 5.
*/

//Correct code
class Demo {
public static void main(String[] args) {
int num = 1;
do {
System.out.println(num);
num++;
} while (num <= 5);
}
}