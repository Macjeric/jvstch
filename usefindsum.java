import mzumbe1.findsum;
import java.util.Scanner;
class usefindsum{
	public static void main(String [] args){
		findsum fs = new findsum();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first Number:");
		fs.num1 = in.nextInt();
		System.out.print("Enter the Second Number:");
		fs.num2 = in.nextInt();
		System.out.println("The sum of "+fs.num1+" and "+fs.num2+" is "+fs.sum);
	}
}



