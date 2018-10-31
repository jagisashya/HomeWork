
public class BankAccount {
	private String accountName;
	private String accountNum;
	private double balance;
	private boolean isOverDraftAllowed;
	private double overDraftsum;
	
	public BankAccount(String accountName, String accountNum, double balance, boolean isOverDraftAllowed,
			double overDraftsum) {
		super();
		 
		this.accountName = (accountName .equals(null))?"Account":accountName;
		this.accountNum = (accountNum .equals(null))?"000001":accountNum;
		this.balance = balance;
		this.isOverDraftAllowed = isOverDraftAllowed;
		this.overDraftsum = overDraftsum;
	}
	
	public BankAccount() {
		this.accountName = "Account";
		this.accountNum =  "000001";
		this.balance = 0;
		this.isOverDraftAllowed = false;
		this.overDraftsum = 0;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isOverDraftAllowed() {
		return isOverDraftAllowed;
	}

	public void setOverDraftAllowed(boolean isOverDraftAllowed) {
		this.isOverDraftAllowed = isOverDraftAllowed;
	}
	
	public void changeOverDraftAllowed () {
		this.isOverDraftAllowed = (this.isOverDraftAllowed)?false:true;
	}

	public double getOverDraftsum() {
		return overDraftsum;
	}

	public void setOverDraftsum(double overDraftsum) {
		this.overDraftsum = overDraftsum;
	}
	
	public boolean deposit (double deposit) {
		if (deposit < 0) 
			return false;
		else {
			balance += deposit;
			return true;
		}
	}
	
	public int withdrawal (double withdraw) {
		if (withdraw < 0) 
			return 2;
		
		double limit = (this.isOverDraftAllowed)?overDraftsum:0;
		
		if (this.balance < 0) {
			if (-this.balance > limit) 
				return 3;
		}
			
		this.balance -= withdraw;
		
		if (this.balance < 0) {
			if (-this.balance > limit) {
				this.balance=-limit;
				return 1;
			}
		}
		return 0;
	}
	
	public String toString () {
		return
		"Account Name       ==> " + this.accountName + '\n' +
		"Account Num        ==> " + this.accountNum  + '\n' +
		"Actual Balance     ==> " + this.balance     + '\n' +
		"Over Draft Allowed ==> " + this.isOverDraftAllowed + '\n' +
		"Account Framework  ==> " + this.overDraftsum;
	}
}
