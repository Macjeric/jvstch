import java.util.Scanner;
	class Addjava{
		public static void main(String[] args){
		int num1,num2,product;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		num1 = in.nextInt();
		System.out.print("Enter the second number: ");
		num2 = in.nextInt();

		product = num1 * num2;

		System.out.print("The Product is: "+product);
	}
}
