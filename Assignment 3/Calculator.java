import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the 1st number : ");
		int a = num.nextInt();
		System.out.print("Enter the 2nd number : ");
		int b = num.nextInt();
		System.out.println("Click 1 for Addition");
		System.out.println("Click 2 for Substraction");
		System.out.println("Click 3 for Multiplication");
		System.out.println("Click 4 for Division");
		int o = num.nextInt();
		switch(o){
			case 1:
				System.out.println("Addition of "+a+ " & "+b+" is : "+(a+b));
				break;
			case 2:
				System.out.println("Substraction of "+a+ " & "+b+" is : "+(a-b));
				break;
			case 3:
				System.out.println("Multiplication of "+a+ " & "+b+" is : "+(a*b));
				break;
			case 4:
				if(b==0){
					System.out.println("Error!!! Please check number");
				}else if((a/b)==0){
					System.out.println("Error!!! Please check number");
				}else{
				System.out.println("Division of "+a+ " & "+b+" is : "+(a/b));
				}
				break;
		}
	}
}