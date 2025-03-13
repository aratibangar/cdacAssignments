// Write a program to find the largest of three numbers using only the ternary operator(? :).

class LargestTernary{
	public static void main(String args[]){
		int a = 10, b = 50, c = 30;
		int result = a>b ? ((a>c)?a:c):((b>c)?b:c);
		System.out.println("Largest Number is : "+result);
	}
}