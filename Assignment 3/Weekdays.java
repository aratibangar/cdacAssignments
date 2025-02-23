import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = num.nextInt();
		
		switch(n){
			case 1:
				System.out.println(" Monday \n Weekday");
				break;
			case 2:
				System.out.println(" Tuesday \n Weekday");
				break;
			case 3:
				System.out.println(" Wednesday \n Weekday");
				break;
			case 4:
				System.out.println(" Thursday \n Weekday");
				break;
			case 5:
				System.out.println(" Firday \n Weekday");
				break;
			case 6:
				System.out.println(" Saturday \n Weekday");
				break;
			case 7:
				System.out.println(" Sunday \n Weekend");
				break;
		}
	}
}