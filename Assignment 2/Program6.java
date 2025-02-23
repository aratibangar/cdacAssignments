import java.util.*;

class Demo{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the Length of Rectangle");
		int length = num.nextInt();
		System.out.println("Enter the width of Rectangle");
		int width = num.nextInt();
		int area = length * width;
		System.out.println("Area of Rectangle is : " +area);
		
	}
}