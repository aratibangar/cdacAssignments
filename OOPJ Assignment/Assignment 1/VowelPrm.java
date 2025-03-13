//6. Develop a program that takes user input for a character and prints whether it is a vowel or consonant.
import java.util.*;
class VowelPrm{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'u'){
			System.out.println(ch+" is a vowel");
		}else{
			System.out.println(ch+" is a Consonant");
		}
	}
}