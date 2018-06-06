import mzumbe1.formular.MatheformularICTM;
import java.util.Scanner;
class ImportMatheformularICTM{

	public static void main(String [] args){

		Scanner input = new Scanner(System.in);
		double valueA = 0.0d;
		double valueB = 0.0d;
		double valueC = 0.0d;
		double aradius = 0.0d;
		double aheight = 0.0d;
		double abase = 0.0d;

		System.out.print("Enter value of A: ");
		valueA= input.nextDouble();
		System.out.print("Enter value of B: ");
		valueB= input.nextDouble();
		System.out.print("Enter value of C: ");
		valueC= input.nextDouble();
		System.out.print("Enter value of radius: ");
		aradius= input.nextDouble();
		System.out.print("Enter value of height: ");
		aheight= input.nextDouble();
		System.out.print("Enter value of base: ");
		abase= input.nextDouble();



		MatheformularICTM mfc = new MatheformularICTM(valueA,valueB,valueC);
		//MatheformularICTM mfc = new MatheformularICTM(valueA,valueB,valueC);
		MatheformularICTM volume = new MatheformularICTM(aradius,aheight);
		MatheformularICTM triangle = new MatheformularICTM(abase,aheight);

		//mfc.x1();
		//mfc.x2();
		volume.findVolume();
		triangle.findAreaOfTriangle();
		//System.out.println("The value of X1 is "+mfc.x1());
		System.out.println("The value of X2 is "+mfc.x2());
		System.out.println("The value of volume is "+volume.findVolume());
		System.out.println("The value of Area of triangle is "+triangle.findAreaOfTriangle());
	}
}


