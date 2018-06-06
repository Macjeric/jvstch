package mzumbe1.formular;
 import java.util.Scanner;
   public class MatheformularICTM{
	public static final double PI = 3.14d;
	public double a = 0.0d;
	public double b = 0.0d;
	public double c = 0.0d;
	public double X1 = 0.0d;
	public double X2 = 0.0d;
	public double radius= 0.0d;
	public double height = 0.0d;
	public double base = 0.0d;
	public double volume = 0.0d;
	public double Area = 0.0d;
	public double d = 0.0d;


	// create construture;

	public MatheformularICTM(double x,double y,double z){
		a = x;
		b = y;
		c = z;
	}
	public MatheformularICTM(double w,double t){
			radius = w;
			height = w;
			base = t;
	}

    // ctreat the method for find Quadratic , Volume and Area of triagle;

  public double x1(){
  		double p = Math.pow(b,2) - 4*a*c;
  		if (p<0){
  			X1 = (-b - Math.sqrt(Math.abs(p)))/(2*a);
  			System.out.print("x1 is "+X1+"i");
  		}else if (p==0){
  			X1 = -b/2*a;
  			System.out.print("x1 is "+X1);
  		}else {
  			d = Math.sqrt(p);
  			X1 = (-b/(2*a))-(d/(2*a));
  			System.out.print("x1 is "+X1);
  		}
  		return X1;
  	}
  	public double x2(){
  		double p = Math.pow(b,2) - 4*a*c;
  				if (p<0){
  					X2 = (-b + Math.sqrt(Math.abs(p)))/(2*a);
  					System.out.print("x2 is "+X2+"i");
  				}else if (p==0){
  					X2 = -b/2*a;
  					System.out.print("x2 is "+X2);
  				}else {
  					d = Math.sqrt(p);
  					X2 = (-b/(2*a))+(d/(2*a));
  					System.out.print("x2 is "+X2);
  		}
  		return X2;
  	}

	public double findVolume(){
			volume = (4*PI*radius*radius*height)/3;

			return volume;

		}
	public double findAreaOfTriangle(){
			Area = 0.5*base*height;

			return Area;

		}

}








