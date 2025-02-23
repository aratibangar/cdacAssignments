//Deiscount.java
import java.util.*;

class Demo{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Purchase Price : ");
		int p = num.nextInt();
		System.out.println("Click 1 for Membership Card");
		System.out.println("Click 2 for No Membership Card");
		int m = num.nextInt();
		switch(m){
			case 1:
				if(p>=1000){
					int d = (p*25)/100;
					int total = p-d;
					System.out.print("Total Discount Amount is : " +total);
				}else if(p>=500 && p<1000){
					int d = (p*15)/100;
					int total = p-d;
					System.out.print("Total Discount Amount is : " +total);
				}else if(p<500){
					int d = (p*10)/100;
					int total = p-d;
					System.out.print("Total Discount Amount is : " +total);
				}else {
					System.out.print("Total Amount is : " +p);
				}
				break;
			case 2:
				if(p>=1000){
				int d = (p*20)/100;
				int total = p-d;
				System.out.print("Total Discount Amount is : " +total);
			}else if(p>=500 && p<1000){
				int d = (p*10)/100;
				int total = p-d;
				System.out.print("Total Discount Amount is : " +total);
			}else if(p<500){
				int d = (p*5)/100;
				int total = p-d;
				System.out.print("Total Discount Amount is : " +total);
			}else {
				System.out.print("Total Amount is : " +p);
			}
				break;
		}
		
	}
}