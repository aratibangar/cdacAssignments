//Sumdigit.java

class Demo{
	public static void main(String args[]){
		int num = 9876, sum=0, n;
		while(num!=0){
			n = num % 10;
			sum = sum + n;
			num = num/10;
		}
		System.out.println("Sum of numbers is : " +sum);
	}
}