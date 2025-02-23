//Prime5.java

class Demo {
    public static void main(String[] args) {
        int count = 0, num = 2;

        System.out.println("First 5 Prime Numbers:");

        while (count < 5) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++; // Move to the next number
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
