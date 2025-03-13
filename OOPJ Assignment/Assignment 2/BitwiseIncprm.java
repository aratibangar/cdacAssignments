/*Q21: Write a program that increments a number without using + or ++ operators. Hint: Use bitwise - (~x).*/

class BitwiseIncprm{
	public static void main(String args[]){
		int a=8;
		int result = ~a;
		System.out.println(-result);
	}
}