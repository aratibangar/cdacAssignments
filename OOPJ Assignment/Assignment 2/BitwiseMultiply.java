/*Q12: Write a Java program to multiply a number by 8 without using * or / operators.
Hint: Use bitwise left shift (<<).*/

class BitwiseMultiply{
	public static void main(String args[]){
		int n = 5;
		int result = n << 8;
		System.out.println("n : "+n);
		System.out.println("result : "+result);
	}
}