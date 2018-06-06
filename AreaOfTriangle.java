import java.util.Scanner;
class AreaOfTriangle{
	public static void main(String [] args){
		int height, base;
		double area;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter height: ");
		height = in.nextInt();
		System.out.print("Enter base: ");
		base = in.nextInt();

		area = 0.5 * height * base;
		
		System.out.println("Area of the triangle with base = "+base+" height = "+height+" is = "+area);

	}
}