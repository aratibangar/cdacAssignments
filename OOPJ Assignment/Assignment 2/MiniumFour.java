/*Q17: Implement a Java program that finds the minimum of four numbers using nested
ternary operator*/

class MiniumFour{
	public static void main(String args[]){
		int a=13, b=4,c=55,d=26;
		int result = (a<b && a<c && a<d)?a:(b<a && b<c && b<d)?b:(c<a && c<b && c<d)?c:d;
		System.out.println(result+" is minimum number");
	}
}