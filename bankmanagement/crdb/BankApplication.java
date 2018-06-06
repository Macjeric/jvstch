import java.util.Scanner;
class BankApplication{
	public String firstname = "che";
	public String middlename = "";
	public String lastname = "em";
	public String username = "Rambo John";
	public String password = "Rambo";
	public String bankaccount;
	public static String bankname = "CRDB";
	public double deposit = 50000D;

	public void welcomeDisplay(){
		System.out.println("This is "+bankname+", Please Enter your User Name and Password ");
		System.out.println("");
	}

	public void userLogin(){
		Scanner input = new Scanner (System.in);
		System.out.print("Please Enter your User Name: ");
		username = input.nextLine();
		System.out.print("Please Enter your Password: ");
		password = input.next();
	}

	public void userVerification(){
		userLogin();
			for (int e = 1; e<=3; e++){
				if ( (username.equals ("che")) && (password.equals ("em")) ){
					System.out.println("");
					System.out.println("Dear customer,"+firstname+" "+middlename+" "+lastname+", Welcome to "+bankname+" Bank");
					messageDisplay();
					break;

				}

				 else if ( (!username.equals ("che")) && (password.equals ("em")) ){
					 if (e == 3){
					 System.out.println("Incorrect Login details, Access Denied ");
					 System.exit(0);
					}
					System.out.println("Incorrect Username, Re enter your username and password ");
					userLogin();


				}

				else if ( (username.equals ("che")) && (!password.equals ("em")) ){
					if (e == 3){
					System.out.println("Incorrect Login details, Access Denied ");
					System.exit(0);
					}
					System.out.println("Incorrect Password, Re enter your username and password ");
					userLogin();


				}
				else if( (!username.equals ("che")) && (!password.equals ("em")) ){
					if (e == 3){
					System.out.println("Incorrect Login details, Access Denied ");
					System.exit(0);
					}
					System.out.println("Incorrect Username and Password, Re enter your username and password ");
					userLogin();


				}

			}


	}

	public void messageDisplay(){
		System.out.println(" ");
		System.out.println("Press 1 to check balance. ");
		System.out.println("Press 2 to deposit cash. ");
		System.out.println("Press 3 to withdraw money. ");
		System.out.println("Press 4 to quit. ");
		transaction();

	}

	public void transaction(){
		int i = 0;
		Scanner input = new Scanner (System.in);
		System.out.println(" ");
		System.out.println("Please Choose from the above: ");
		i = input.nextInt();
		switch(i)
		{

			case 1:
			System.out.println(" ");
			System.out.println("Your Initial Balance is "+deposit+"/=");
			System.out.println(" ");
			System.out.println("Thank you Dear customer "+firstname+" "+middlename+" "+lastname+" Welcome Again !");
			break;

			case 2:
			System.out.println(" ");
			System.out.println("Enter Amount to Deposit: ");
			double amount = input.nextDouble();
			if (amount < 5000){
				System.out.println("Little Amount, Amount Should be above 5000/= ");
				System.out.println(" ");

			}else{
					double balance =deposit + amount;
					System.out.println("You have successively deposit "+amount+"/=");
					System.out.println("Your new balance is "+balance+"/=");
					System.out.println("Thank you Dear customer "+firstname+" "+middlename+" "+lastname+" Welcome Again");

			}
			break;

			case 3:
			System.out.println(" ");
			System.out.println("Enter Amount to withdraw: ");
			double withdraw = input.nextDouble();
			if (withdraw > 40000){
				System.out.println("You cannot empty your Account ");
				System.out.println(" ");
                System.exit(0);
				withdraw = input.nextDouble();
			}
				else{
					double balance1 =deposit - withdraw;
					System.out.println("You have successively Withdrawn "+withdraw+"/=");
					System.out.println("Your new balance is "+balance1+"/=");
					System.out.println("Thank you Dear customer "+firstname+" "+middlename+" "+lastname+" Welcome Again");
				}


			break;

			case 4:
			System.out.println("Thank you for Using "+bankname+" Bank Welcome Again");
			System.exit(0);

			default:
			System.out.println("No Such a Service ");

		}
	}


	public static void main (String [] args ){

		BankApplication bp = new BankApplication();
		bp.welcomeDisplay();
		bp.userVerification();

	}
}
