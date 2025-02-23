import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the Marks : ");
		int marks = num.nextInt();
		if(marks>=90){
			System.out.println("A");
		}else if(marks>=80 && marks<=89){
			System.out.println("B");
		}else if(marks>=70 && marks<=79){
			System.out.println("C");
		}else if(marks>=60 && marks<=69){
			System.out.println("D");
		}else{
			System.out.println("F");
		}
	}
}