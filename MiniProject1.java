import java.util.Scanner;

public class MiniProject1
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);

		int balance = 10_00_00_000;
		
		int withdraw,deposit,choice;


		while(true) {

			System.out.println("\n $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$-----ATM-----$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println();
			System.out.println("1.check for balance");
			System.out.println();
			System.out.println("2.cash withdraw");
			System.out.println();
			System.out.println("3.cash deposit");
			System.out.println();
			System.out.println("4.exit");
			System.out.println();
			System.out.println("please enter your choice");

			choice = s.nextInt();

			switch(choice) {
			case 1:
				System.out.println("Account_Balance ---> "+ balance);
				break;

			case 2:
				System.out.println("Enter the amount:");
				int cash = s.nextInt();

				withdraw = cash - balance;
				if(withdraw<=balance) {
					System.out.println("your cash withdraw successfully --->"+ withdraw);
				}
				else {
					System.out.println("declined transaction");
				}
				break;

			case 3:
				System.out.println("Enter the amount:");
				int depo_cash = s.nextInt();
				deposit = depo_cash + balance;
				System.out.println("cash has been deposited successfully --->"+ deposit);
				break;

			case 4:
				System.out.println("thankyou visit again:)");
				s.close();
				System.exit(0);

			default:
				System.out.println("invalid choice,please enter correct choice code");
			}

		}

	}
}