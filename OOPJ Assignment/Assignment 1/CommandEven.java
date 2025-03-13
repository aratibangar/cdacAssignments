//7. Create a Java program to check whether a given number is even or odd using command-line arguments.

class CommandEven{
	public static void main(String args[]){
		String s1 = args[0];
		int a = Integer.parseInt(s1);
		if(a%2==0){
			System.out.println(a+ " is Even");
		}else{
			System.out.println(a+ " is Odd");
		}
	}
}