import java.util.Scanner;
class AtmMzumbe{
	String name;
	String gender;
	String address;
	int age = 0;
	int phone = 0 ;
	int pass = 111;
	int rpass = 111;
	int withdraw=0;
    int deposit=0;
    int balance = 0;
    void startPrgram(){
		System.out.println("*************************");
		System.out.println("WELCOME HAFIDH BANK!");
		System.out.println("*************************");
		System.out.println("Please provide your details");
		System.out.println("*-----------------------*");

	}
    void yourInformation(){
		System.out.println("Enter your full name");
		Scanner input = new Scanner(System.in);
		Scanner ss = new Scanner(System.in);
        name = ss.next();
        System.out.println("Enter your GENDER");
        gender = ss.next();
        System.out.println("Enter your AGE");
        age = input.nextInt();
        if (age < 18){
			System.out.println("too young to have account,valid for 18+");
			System.exit(0);
		}
        	System.out.println("Enter your phone number");
		    phone = input.nextInt();
        	System.out.println("Enter your ADDRESS i.e Region,district");
        	address = ss.next();
			System.out.println("Create your password");
			pass = input.nextInt();

			System.out.println("Re-type your password");
		for (int d=1; d<=4; d++){
		    rpass = input.nextInt();
		if (pass!=rpass) {
		    System.out.println("WRONG please tray again password don't mach"); continue;

        }else{
        	System.out.println("*----------------------------*");
		    System.out.println("CHECK YOUR DETAIL ");
		    System.out.println("*----------------------------*");
		    System.out.println("NAME "+name);
		    System.out.println("*----------------------------*");
		    System.out.println("AGE "+age);
		    System.out.println("*----------------------------*");
		    System.out.println("GENDER "+gender);
		    System.out.println("*----------------------------*");
		    System.out.println("ADDRESS "+address);
		    System.out.println("*----------------------------*");
		    System.out.println("PHONE NO. "+phone);
		    System.out.println("*----------------------------*");
			System.out.println("your password is "+pass);
		    System.out.println("*----------------------------------------------------------------------*");
			System.out.println("please keep your password safe you will need it to make transaction ");
			System.out.println("*----------------------------------------------------------------------*");
		    System.out.println("Provide your initial balance");
			System.out.println("NOTE! Your minimum balance should be 10,000/=");
			System.out.println("*---------------------------------------------*");
		}
	}
}
		void initialBalance(){
			Scanner ance= new Scanner(System.in);
			System.out.println();
			System.out.print("Enter your initial Value");
		for (int blc=1;blc<=3;blc++){
			balance = ance.nextInt();
		if(balance<10000){
			System.out.println("Balance too low ! please add more"); continue;
	}else{
			System.out.println("Your initial balance is " + balance);
		}
	}
}
		void displayOperatinDetails(){
		for(int c = 1; c<=5; c++){
			System.out.println("*************************");
			System.out.println("CHOOSE YOUR OPTION");
			System.out.println("*************************");
			System.out.println("1. CHECK BALANCE");
			System.out.println("2. WITHDRAW CASH");
			System.out.println("3. DEPOSIT CASH");
			System.out.println("4. EXIT");
		}
	}

	void displayBaanceDetails(){
		for(int c = 1; c<=5; c++){
			Scanner Cbalance= new Scanner(System.in);
			int CB = Cbalance.nextInt();
		if(CB==1){
			System.out.println("ENTER password");
		for (int b=1;b<=3;b++){
			int npass = Cbalance.nextInt();
		if (npass!=pass) {
			System.out.println("wrong password try again");
		continue;
            						}
            else{
				System.out.println("Your balance is "+balance);
			}
			break;
			}

			}
			else if (CB==2){
				System.out.println("ENTER password");
			for (int w=1;w<=3;w++){
			int npass = Cbalance.nextInt();
			if (npass!=pass){
				System.out.println("wrong password, try again");

            }
            else{
			    System.out.println("ENTER AMOUNT");

			    withdraw = Cbalance.nextInt();
			if (withdraw > balance){
			    System.out.println("you don't have enough balance in your account");
			   	System.out.println("your balance is "+balance+"please put the correct amount");

            }else
            {
				balance-=withdraw;
				System.out.println("You have successively withdraw "+withdraw+"/=");
				System.out.println("Your new balance is "+balance+"/=");
			}break;
            } }
            }
            else if(CB==3){
				System.out.println("ENTER password");
			    for (int dp=1;dp<=3;dp++){
			    int npass = Cbalance.nextInt();

			if (npass!=pass){
				System.out.println("wrong password,try again!");
				}
			else {
			    System.out.println("ENTER AMOUNT");
			    deposit = Cbalance.nextInt();
			    balance+=deposit;
			    System.out.println("You have successively deposit "+deposit+"/=");
			    System.out.println("Your new balance is "+balance+"/=");
			    System.out.println("thank you!");
			    }
			    break;
				}
				}
            else if(CB==4) {
			   	System.out.println("bye....!!!");
			 	System.exit(0);
			 	}
			else {
				System.out.println("wrong choice");
				}
        	}
		}
			public static void main(String []args){
				AtmMzumbe atm = new AtmMzumbe();
				atm.startPrgram();
				atm.yourInformation();
				Scanner ance= new Scanner(System.in);
							System.out.println();
							System.out.print("Enter your initial Value");
						for (int blc=1;blc<=3;blc++){
							atm.balance = ance.nextInt();
						if(atm.balance<10000){
							System.out.println("Balance too low ! please add more"); continue;
					}else{
							System.out.println("Your initial balance is " + atm.balance);
						}
	}
				atm.displayOperatinDetails();
				atm.displayBaanceDetails();
		}
	}









