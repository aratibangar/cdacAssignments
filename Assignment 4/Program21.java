/* - output
1
1*3
1*3*5
1*3*5*7
1*3*5*7*9
*/

class Demo{
	public static void main(String args[]){
		
		for(int i=1; i<=5; i++){
			 int n=1;
			for(int j = 1; j<=i; j++){
				System.out.print(n);
				if (j < i) {
                    System.out.print("*"); // Print '*' between numbers
                }
			n +=2;
			}
			System.out.println();
		}
	}
}