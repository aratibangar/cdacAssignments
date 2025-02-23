//Largestdigit.java

class Demo{
	public static void main(String args[]){
		int num = 9876, large = 0, n;
		while(num!=0){
			n = num% 10;
			if(n>large){
				large=n;
			}
			num /= 10;
		}
			System.out.println(" " +large);		
			
	}
}