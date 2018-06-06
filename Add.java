import java.util.Scanner;
class Add{
double num1 = 0.0d;
double num2 = 0.0d;
double sum = 0.0d;
double num3 = 0.0d;
double num4 = 0.0d;

double addNumbers(){
	sum = num1+num2;
	return sum;
}
void displayResult(){
System.out.println("The sum is "+sum);
}
public static void main(String [] args){
Scanner input = new Scanner(System.in);
Add ictm = new Add();
System.out.println("Enter the first Number:");
ictm.num1 = input.nextDouble();
System.out.println("Enter the Second Number:");
ictm.num2 = input.nextDouble();

ictm.addNumbers();
ictm.displayResult();

}
}
