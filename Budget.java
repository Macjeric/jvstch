import java.util.Scanner;
class Budget{
	public static void main(String [] args){
	int Accomodation,Boom,Stationary,Project,Balance,Total;
	Scanner in = new Scanner(System.in);

	System.out.println("\t\t\tHELSB Budget\n");
	System.out.println("Enter the Total Loan Provided to you by HELSB:");
	Total = in.nextInt();

    System.out.println("Enter the Accomodation fee already Provided:");
	Accomodation = in.nextInt();

	System.out.println("Enter the Boom fee already Provided:");
	Boom = in.nextInt();

	System.out.println("Enter the Stationary fee already Provided:");
	Stationary = in.nextInt();

	System.out.println("Enter the Project fee already Provided:");
	Project = in.nextInt();

	Balance = Total - (Accomodation+Boom+Stationary+Project);

    System.out.println("The Balance is:"+Balance);
}
}
