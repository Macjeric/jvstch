import java.util.Scanner;
class abyte{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);
byte abyte1 = 0;
byte abyte2 = 0;
int sum = 0;


System.out.print("Enter first Number(byte): ");
abyte1 = input.nextByte();
System.out.print("Enter Second number(byte): ");
abyte2 = input.nextByte();


sum = abyte1 + abyte2;
System.out.println("The sum is: "+sum);

}
}