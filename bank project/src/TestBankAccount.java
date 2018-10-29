import java.util.Scanner;

public class TestBankAccount {

	public static void main(String[] args) {
		
//		char continueRuning = 'Y';
//		BankAccount bankAccount = new BankAccount(" ", "", 0, false, 0);
		BankAccount bankAccount = new BankAccount();
		int errorNumber =0;
		boolean isPositive = true;
		boolean isEnd = false;
		Scanner input = new Scanner (System.in);
		int choise;
		String ezerString;
		char option;
		
		while (!isEnd) {
			System.out.println("\n\n" +
							   "1 - Change name account. "         + '\n' +
							   "2 - Change Overdraft option. "     + '\n' +
							   "3 - Get Balance. "                 + '\n' +
							   "4 - Change over draft sum. "       + '\n' +
							   "5 - Deposit              . "       + '\n' +
							   "6 - Withdraw money."               + '\n' +
							   "7 - Account Details. "             + '\n' +
							   "8 - Exit.          "               + "\n\n" +
							   "What's your option ?");
			
			option = (input.next().charAt(0));
			choise = (option >= '1'&& option <= '8')?option - '0':0;
			
//			choise = Integer.valueOf(input.nextLine().substring(0,1));
 // choise = (int)(input.nextLine().substring(0,1));
//			switch ((int)input.next().charAt(0)) {
			switch (choise) {

			case 1:
				System.out.print("Old name ==> " + bankAccount.getAccountName() + '\n' +
								 "New name ==> ");
				ezerString = input.next();
				bankAccount.setAccountName(ezerString);
				System.out.println(" ------------------------------------ ");
				break;

			case 2:
				System.out.println("Old over draft option  ==> " + bankAccount.isOverDraftAllowed());
				bankAccount.changeOverDraftAllowed();
				System.out.println("New over draft option  ==> " + bankAccount.isOverDraftAllowed());
				System.out.println(" ------------------------------------ ");
				break;
			
			case 3:
				System.out.println("Balance ==>" + bankAccount.getBalance());
				System.out.println(" ------------------------------------ ");
				break;
				
			case 4:
				System.out.println("Old over draft sum ==> " + bankAccount.getOverDraftsum());
				bankAccount.setOverDraftsum(input.nextDouble());
				System.out.println("New over draft sum ==> " + bankAccount.getOverDraftsum());
				System.out.println(" ------------------------------------ ");
				break;
				
			case 5:
				System.out.println("Old Balance ==>" + bankAccount.getBalance());
				System.out.println("How much to deposit ? ==> ");
				isPositive = bankAccount.deposit(input.nextDouble());
				if(!isPositive) {
					System.out.println("The ammount is negative - operation canceled");
				} else 
					System.out.println("New Balance ==>" + bankAccount.getBalance());
				System.out.println(" ------------------------------------ ");
				break;
				
			case 6:
				System.out.println("Old Balance ==>" + bankAccount.getBalance());
				System.out.println("How much to Withdraw ? ==> ");
				errorNumber = bankAccount.withdrawal(input.nextDouble());
				switch (errorNumber) {
				case 1: case3:
					System.out.println("Pay attention - you have passe your limit account");
  				    System.out.println(" ------------------------------------ ");

					break;
				case 2:
					System.out.println("The ammount is negative - operation canceled");
					System.out.println(" ------------------------------------ ");
					break;
				default:
					break;
				}
				break;
				
			case 7:
				System.out.println(bankAccount);
				System.out.println(" ------------------------------------ ");
				break;
				
			case 8:
				isEnd = true;
				break;
				
			default:
				System.out.println("Please chose option between 1 to 7");
				

			}
			System.out.println("Press any key to continue");
			ezerString=input.nextLine();
			ezerString=input.nextLine();

		}
		
		System.out.println("------------------- T h e    E n d "
				         + "-------------------");
	}

}
