/*Write a program that prints all even numbers from 1 to 100 using only bitwise AND(&) and for loop.*/

class BitwiseEvenhun{
	public static void main(String args[]){
	for(int i=1;i<=100;i++){
		if((i&1)==0){
			System.out.print(i+" ");
		}
	}
}
}