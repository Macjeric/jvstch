import java.util.Scanner;
class Decision{
	public static void main (String [] args){
		float marks = 50.0F;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Marks of the Student:");
		marks = in.nextFloat();

		if(marks>=50)
		System.out.println("The Student has Passed");

		else
		System.out.println("The Student has Failed");
	}
}
