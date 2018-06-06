import java.util.Scanner;
/*ERICK MACKY REG NO:13304015/T.15 */
class ComputeVolume{
public static void main(String [] args){
float radius =0F;
float height =0F;
float PI=3.14F;
float volume = 0F;

Scanner in = new Scanner(System.in);

System.out.println("Calculating the Volume of the Cylinder ");

		System.out.print("Enter the Radius of the Cylinder: ");
		radius = in.nextFloat();
		System.out.print("Enter the Height of the Cylinder: ");
		height = in.nextFloat();


		volume = (4*PI*radius*radius*height)/3;

		System.out.println("The Volume of the Cylinder with Radius = "+radius+" and Height = "+height+" is = "+volume);
	}
}




