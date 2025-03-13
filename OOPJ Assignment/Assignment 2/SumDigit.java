//Q3: Implement a program that calculates the sum of digits of an integer using modulus (%) and division (/) operators.

class SumDigit{
	public static void main(String args[]){
		int a = 12345,remainder=0;
		while(a!=0){
			int digit = a % 10;
			remainder = digit +remainder;
			a /= 10;
		}
		System.out.println("Sum of 12345 is : " +remainder);
	}
}