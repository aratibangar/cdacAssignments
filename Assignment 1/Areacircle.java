import java.util.*;

class Demo{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the value of radius ");
		int r = num.nextInt();
		double area = Math.PI * r * r;
		System.out.println("Radius of circle is : " +area);
	}
}