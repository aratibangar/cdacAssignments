//PassFail.java
import java.util.*;

class Demo{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the 1st Subject Marks: ");
		int a = num.nextInt();
		System.out.println("Enter the 2nd Subject Marks: ");
		int b = num.nextInt();
		System.out.println("Enter the 3rd Subject Marks: ");
		int c = num.nextInt();
		int count = 0;
		
		if(a<=40){
			count=count+1;
		}
		if(b<=40){
			count=count+1;
		}
		if(c<=40){
			count=count+1;
		}
		switch(count){
			case 0:
				System.out.println("Passed in all subject");
				break;
			case 1:
				System.out.println("Student is failed in " +count+ " subject");
				break;
			case 2:
				System.out.println("Student is failed in " +count+ " subject");
				break;
			case 3:
				System.out.println("Student is failed in " +count+ " subject");
				break;
		}
		/*if (count>=0){
			System.out.println("Student is failed in " +count+ " subject");
		}else{
			System.out.println("Passed in all subject");
		}*/
	}
}