import java.util.*;

class Demo{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the side of square");
		int n = num.nextInt();
		int area = n * n;
		System.out.println("Area of Square is : " +area);
		
	}
}