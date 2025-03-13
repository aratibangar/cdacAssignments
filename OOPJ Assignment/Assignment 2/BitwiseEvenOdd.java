//Write a program to check whether a given number is even or odd using only bitwise operators. Hint: Use n & 1 to check.

class BitwiseEvenOdd {
    public static void main(String[] args) {
        int num = 8;
        
        if ((num & 1) == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}