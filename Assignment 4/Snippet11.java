/*Snippet 11:
public class IncorrectLoopUpdate {
public static void main(String[] args) {
int i = 0;
while (i < 5) {
System.out.println(i);
i += 2; // Error: This may cause unexpected results in output
}
}
}
// Error to investigate: What will be the output of this loop? How should the loop variable be updated to achieve the
desired result?
- output :
0
2
4
- just add 1 instead of 2 then increment done by 1
*/

//Correct Code
class Demo {
public static void main(String[] args) {
int i = 0;
while (i < 5) {
System.out.println(i);
i += 2; // Error: This may cause unexpected results in output
}
}
}