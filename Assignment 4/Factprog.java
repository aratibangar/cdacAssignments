//Factprog.java

class Demo{
	public static void main(String args[]){
		int fact = 1;
		int n = 10;
		for (int i=1; i<=n; i++){
			fact = fact*i;
		}
		System.out.println("Factorial is " +fact);
	}
}