/*Snippet 9:
public class Main {
public static void main(String[] args) {
int class = 10;
System.out.println(class);
}
}
 What error occurs? Why can't reserved keywords be used as identifiers?
error: not a statement
int class = 10;
^
error: ';' expected
int class = 10;
   ^
error: <identifier> expected
int class = 10;
         ^
error: <identifier> expected
System.out.println(class);
                  ^
error: illegal start of type
System.out.println(class);

error: <identifier> expected
System.out.println(class);

error: reached end of file while parsing

-Why can't reserved keywords be used as identifiers?
- reserved keywords cannot be used as identifiers because they have special meaning in the language and are used to define the structure and behavior of the program


*/

//Correct Program
class Main {
public static void main(String[] args) {
int s = 10;
System.out.println(s);
}
}