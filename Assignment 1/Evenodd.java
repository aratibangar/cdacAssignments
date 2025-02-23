import java.util.*;

class Demo{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the number");
		int num1 = num.nextInt();
		if(num1%2 == 0){
			System.out.println("The number " + num1 + " is even.");
		}
		else{
			System.out.println("The number " + num1 + " is odd.");
		}
	}
}