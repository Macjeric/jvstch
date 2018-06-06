import java.util.Scanner;
class CheckBooleanValuesICTM{
	boolean check1 = false;
	boolean check1 = false;
	boolean check1 = false;

	CheckBooleanValuesICTM(boolean chk1, boolean chk2, boolean chk3){
		check1 = chk1;
		check2 = chk2;
		check3 = chk3;
	}
	void checkValues(){
		if ((check1 == true) && (check2== true) && (check3 == true)){
		System.out.println("check1 is true, check2 is true,check3 is true");
	}else if ((check1 == true) && (check == true) && (check3!=true)){
		System.out.println("check1 is true, check2 is true,check3 is false");
	}else if ((check1 == true) && (check2!=true) &&(check3==true)){
	System.out.println("check1 is true, check2 is false,check3 is true");
	}else if ((check1 != true) && (check2!=true) &&(check3==true)){
	System.out.println("check1 is false, check2 is false,check3 is true");
	}else if ((check1 == true) && (check2!=true) &&(check3!=true)){
	System.out.println("check1 is true, check2 is false,check3 is false");
	}else if ((check1 != true) && (check2!=true) &&(check3==true)){
	System.out.println("check1 is false, check2 is false,check3 is true");
	}else if ((check1 != true) && (check2==true) &&(check3!=true)){
	System.out.println("check1 is false, check2 is true,check3 is false");
    }else{((check1 != true) && (check2!=true) &&(check3!=true)){
		System.out.println("check1 is false, check2 is false,check3 is false");

}
}
public static void main(String [] args){
	boolean val1 = false;
	boolean val2 = false;
	boolean val3 = false;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter check1 value: ");








