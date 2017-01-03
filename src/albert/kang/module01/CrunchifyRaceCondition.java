package albert.kang.module01;

public class CrunchifyRaceCondition {
	 
	public static void main(String[] args) {
		CrunchifyBankAccount crunchifyAccount = new CrunchifyBankAccount("CrunchifyAccountNumber");
 
		// Total Expected Deposit: 10000 (100 x 100)
		for (int i = 0; i < 100; i++) {
			CrunchifyTransaction t = new CrunchifyTransaction(crunchifyAccount, CrunchifyTransaction.TransactionType.DEPOSIT_MONEY, 100);
			t.start();
		}
 
		// Total Expected Withdrawal: 5000 (100 x 50)
		for (int i = 0; i < 100; i++) {
			CrunchifyTransaction t = new CrunchifyTransaction(crunchifyAccount, CrunchifyTransaction.TransactionType.WITHDRAW_MONEY, 50);
			t.start();
 
		}
 
		// Let's just wait for a second to make sure all thread execution completes.
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
 
		// Expected account balance is 5000
		System.out.println("Final Account Balance: " + crunchifyAccount.getAccountBalance());
	}
}



class CrunchifyTransaction extends Thread {
	 
	public static enum TransactionType {
		DEPOSIT_MONEY(1), WITHDRAW_MONEY(2);
 
		private TransactionType(int value) {
		}
	};
 
	private TransactionType transactionType;
	private CrunchifyBankAccount crunchifyAccount;
	private double crunchifyAmount;
 
	/*
	 * If transactionType == 1, depositAmount() else if transactionType == 2 withdrawAmount()
	 */
	public CrunchifyTransaction(CrunchifyBankAccount crunchifyAccount, TransactionType transactionType, double crunchifyAmount) {
		this.transactionType = transactionType;
		this.crunchifyAccount = crunchifyAccount;
		this.crunchifyAmount = crunchifyAmount;
	}
 
	public void run() {
		switch (this.transactionType) {
		case DEPOSIT_MONEY:
			depositAmount();
			printBalance();
			break;
		case WITHDRAW_MONEY:
			withdrawAmount();
			printBalance();
			break;
		default:
			System.out.println("NOT A VALID TRANSACTION");
		}
	}
 
	public void depositAmount() {
		this.crunchifyAccount.depositAmount(this.crunchifyAmount);
	}
 
	public void withdrawAmount() {
		this.crunchifyAccount.withdrawAmount(crunchifyAmount);
	}
 
	public void printBalance() {
		System.out.println(Thread.currentThread().getName() + " : TransactionType: " + this.transactionType + ", Amount: " + this.crunchifyAmount);
		System.out.println("New Account Balance: " + this.crunchifyAccount.getAccountBalance());
	}
}



class CrunchifyBankAccount {
	private String crunchifyAccountNumber;
	private double crunchifyAccountBalance;
 
	public String getAccountNumber() {
		return crunchifyAccountNumber;
	}
 
	public double getAccountBalance() {
		return crunchifyAccountBalance;
	}
 
	public CrunchifyBankAccount(String crunchifyAccountNumber) {
		this.crunchifyAccountNumber = crunchifyAccountNumber;
	}
 
	// Make a note of this line -- synchronized keyword added
	public synchronized boolean depositAmount(double amount) {
		if (amount < 0) {
			return false;
		} else {
			crunchifyAccountBalance = crunchifyAccountBalance + amount;
			return true;
		}
	}
 
	// Make a note of this line -- synchronized keyword added
	public synchronized boolean withdrawAmount(double amount) {
		if (amount > crunchifyAccountBalance) {
			return false;
		} else {
			crunchifyAccountBalance = crunchifyAccountBalance - amount;
			return true;
		}
	}
}

