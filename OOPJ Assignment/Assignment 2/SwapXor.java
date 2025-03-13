/*Write a program to swap two numbers without using a third variable and without using arithmetic operators like + or -. Hint: Use bitwise XOR ^ operator*/

class SwapXor{
	public static void main(String args[]){
		int a =10, b= 20;
		System.out.println("a "+a+" b "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a "+a+" b "+b);
	}
}