/*Write a program to determine if a character is a vowel or a consonant using the
ternary operator*/

import java.util.*;
class VowelTernary{
	public static void main(String[] args) {
		
        char ch = 'a';
        
        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
                        ? "Vowel" : "Consonant";
        
        System.out.println(ch + " is a " + result);
    }
}