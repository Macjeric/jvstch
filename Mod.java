import java.util.Scanner;
class Mod{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);
int abyte1 = 0;
double abyte2 = 0;
double mod = 0;


System.out.print("Enter first Number: ");
abyte1 = input.nextInt();
System.out.print("Enter Second number: ");
abyte2 = input.nextDouble();


mod = abyte1/abyte2;
System.out.println("The Mod is: "+mod);
}
}
