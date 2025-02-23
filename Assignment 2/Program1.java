import java.util.*;

class Demo{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = num.nextInt();
		if(n>0){
			System.out.println("The number " + n + " is Positive");
		}else{
			System.out.println("The number " + n + " is Negative");		
		}
	}
}