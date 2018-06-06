	package mzumbe.quadraticfunctions;
public class MathFomulaClass{
	public double X1;
	public double b;
	public double a;
	public double c;
	public double X2;
	public double V;
	public double r;
	public double hv;
	public double ha;
	public double A;
	public double ba;
	public double d;
	public  static final double PI=3.14d;

	public MathFomulaClass(double i, double j, double k){
		a = i;
		b = j;
		c = k;
	}

	public MathFomulaClass( double l, double m){
		r = l;
		hv = m;
	}

	public MathFomulaClass( double v, double u){
		ha = v;
		ba = u;
	}

switch(choice){
	case 1: System.out.println("1. Press One to solve quadratic equation.");
    public double x1(){
		double p = Math.pow(b,2) - 4*a*c;
		if (p<0){
			X1 = (-b - Math.sqrt(Math.abs(p)))/(2*a);
			System.out.println("x1 is "+X1+"i");
		}else if (p==0){
			X1 = -b/2*a;
			System.out.println("x1 is "+X1);
		}else {
			d = Math.sqrt(p);
			X1 = (-b-d)/2*a;
			System.out.println("x1 is "+X1);
		}
		return X1;
	}
	public double x2(){
		double p = Math.pow(b,2) - 4*a*c;
				if (p<0){
					X2 = (-b + Math.sqrt(Math.abs(p)))/(2*a);
					System.out.println("x2 is "+X2+"i");
				}else if (p==0){
					X2 = -b/2*a;
					System.out.println("x2 is "+X2);
				}else {
					d = Math.sqrt(p);
					X2 = (-b+d)/2*a;
					System.out.println("x2 is "+X2);
		}
		return X2;
		break;
	}
	case 2: System.out.println("2. Press two to solve volume of the cylinder.");
	public double volumeOfCylinder(){
		V = (4*PI*r*r*hv)/3;
		return V;
		break;
	}
	case 3:System.out.println("3. Press three to solve the area of the triangle.");

	public double areaOfTriangle(){
		A = 0.5*ba*ha;
		return A;
		break;
		default: System.out.println("Wrong Choice");


	}

}







