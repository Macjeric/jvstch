/*ERICK MACKY REG NO:13304015/T.15 */
import java.util.Scanner;
class ComputeVolume{
float radius =0F;
float height =0F;
static final float PI=3.14F;
float volume = 0F;

float volumeofCylinder(){
volume = (4*PI*radius*radius*height)/3;
return volume;
}
void displayResult(){
System.out.println("The Volume of the Cylinder with Radius = "+radius+" and Height = "+height+" is = "+volume);
}
public static void main(String [] args){
Scanner in = new Scanner(System.in);
ComputeVolume take = new ComputeVolume();

System.out.print("Enter the Radius of the Cylinder: ");
take.radius = in.nextFloat();
System.out.print("Enter the Height of the Cylinder: ");
take.height = in.nextFloat();

take.volumeofCylinder();
take.displayResult();

	}
}




