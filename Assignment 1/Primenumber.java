import java.util.*;
//Prime5.java


 class Demo {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = num.nextInt();
        num.close();
		int i;
		
        if (isPrime(n)) {
            System.out.println("The number " + n + " is  a prime number.");
        } else {
            System.out.println("The number " + n + " is not a prime number.");
        }
	}	
		public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
}
