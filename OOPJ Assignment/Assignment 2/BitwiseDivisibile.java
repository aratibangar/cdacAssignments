/*Q4: Write a program to find whether a given number is divisible by 3 without using the modulus (%) or division (/) operators. Hint: Use subtraction and bitwise shifts*/


class BitwiseDivisibile {
    public static void main(String[] args) {
        int num = 25;
        
        while (num > 3) {
            int sum = 0;
            for (int temp = num; temp > 0; temp >>= 1) {
                sum += temp & 1;
            }
            num = sum;
        }
        
        System.out.println((num == 3 || num == 0) ? "Not Divisible by 3" : "Divisible by 3");
    }
}