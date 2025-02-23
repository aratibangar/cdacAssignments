import java.util.*;

class Demo{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = num.nextInt();
		System.out.println("Fibonacci series is : ");
		int first = 0, second = 1;
		for(int i=0; i<=n; i++){
			System.out.println(+first+ " ");
			
			int next = first + second;
			second = first;
			first = next;
			
		}
	}
}