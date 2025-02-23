import java.util.*;

class Demo{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the Time : ");
		int n = num.nextInt();
		 
		if(n>=5 && n <12){
			System.out.println("Good Morning");
		}else{
			System.out.println("Good Evening");
		}
	}
}