//Fibonaccinum.java

class Demo{
	public static void main(String args[]){
		int first = 0, sec = 1;
		while(first<21){
			int next = first + sec;
			sec = first;
			first = next;
			System.out.print(" "+first);
		}
	}
}