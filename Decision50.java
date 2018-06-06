import java.util.Scanner;
class Decision50{

	public static void main(String [] args){
		Another data = new Another();
		Scanner input = new Scanner(System.in);

		System.out.print("Enter base: ");
		data.base = input.nextFloat();

		System.out.println("Enter height: ");
		data.height = input.nextFloat();

		data.area = 0.5f * data.base * data.height;

		System.out.print("Area is "+data.area);
	}
}