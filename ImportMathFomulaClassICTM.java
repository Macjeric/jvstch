import mzumbe.quadraticfunctions.MathFomulaClass;
import java.util.Scanner;
public class ImportMathFomulaClassICTM{
	public static void main(String [] args){
		double a;
		double b;
		double c;
		double r;
		double ha;
		double hv;
		double ba;

        Scanner in = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		a = in.nextDouble();
		System.out.print("Enter the value of b: ");
		b = in.nextDouble();
		System.out.print("Enter the value of c: ");
		c = in.nextDouble();

		System.out.print("Enter the value of the Height of the Cylinder: ");
		hv = in.nextDouble();
		System.out.print("Enter the value of the radius of the Cylinder: ");
		r = in.nextDouble();
		System.out.print("Enter the value of the base of the Triangle: ");
		ba = in.nextDouble();
		System.out.print("Enter the value of the Height of the Triangle: ");
		ha = in.nextDouble();

        MathFomulaClass mfc = new MathFomulaClass(a,b,c);
        MathFomulaClass mfc = new MathFomulaClass(r,hv);
	    MathFomulaClass mfc = new MathFomulaClass(ba,ha);

		mfc.x1();
		mfc.x2();
		System.out.println("Volume of the cylinder is "+mfc.volumeOfCylinder());
		System.out.println("Area of the triangle is "+mfc.areaOfTriangle());

	}
}
