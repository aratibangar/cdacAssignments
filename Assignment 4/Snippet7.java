/*Snippet 7:
public class UninitializedWhileLoop {
public static void main(String[] args) {
int count;
while (count < 10) {
System.out.println(count);
count++;
}
}
}
// Error to investigate: Why does this code produce a compilation error? What needs to be done to initialize the loop
variable properly?
	- variable count might not have been initialized
while (count < 10) {
	- because only declare count variable it has not any value. we have to just initialize count variable.
*/

//Correct code
class Demo {
public static void main(String[] args) {
int count=1;
while (count < 10) {
System.out.println(count);
count++;
}
}
}