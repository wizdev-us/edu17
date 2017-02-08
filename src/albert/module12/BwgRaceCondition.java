package albert.module12;

public class BwgRaceCondition {

	public static void main(String[] args) {
		BwgBankAccount account = new BwgBankAccount("AccountNumber");

		for (int i = 0; i < 100; i++) {
			BankTransaction transaction = new BankTransaction(account, BankTransaction.TransactionType.DEPOSIT_MONEY,
					100);
			transaction.start();
		}

		for (int i = 0; i < 100; i++) {
			BankTransaction transaction = new BankTransaction(account, BankTransaction.TransactionType.WITHDRAW_MONEY,
					50);
			transaction.start();
		}

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		System.out.println("Final Account Balance: " + account.getAccountBalance());
	}
}

class BankTransaction extends Thread {

	public static enum TransactionType {
		DEPOSIT_MONEY(1), WITHDRAW_MONEY(2);

		private TransactionType(int value) {
		}
	};

	private TransactionType transactionType;
	private BwgBankAccount account;
	private double amount;

	public BankTransaction(BwgBankAccount account, TransactionType transactionType, double amount) {
		this.transactionType = transactionType;
		this.account = account;
		this.amount = amount;
	}

	@Override
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
		this.account.depositAmount(this.amount);
	}

	public void withdrawAmount() {
		this.account.withdrawAmount(amount);
	}

	public void printBalance() {
		System.out.println(Thread.currentThread().getName() + " : TransactionType: " + this.transactionType
				+ ", Amount: " + this.amount);
		System.out.println("New Account Balance: " + this.account.getAccountBalance());
	}
}

class BwgBankAccount {
	private String accountNumber;
	private double accountBalance;

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public BwgBankAccount(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public boolean depositAmount(double amount) {
		if (amount < 0) {
			return false;
		} else {
			accountBalance = accountBalance + amount;
			return true;
		}
	}

	public boolean withdrawAmount(double amount) {
		if (amount > accountBalance) {
			return false;
		} else {
			accountBalance = accountBalance - amount;
			return true;
		}
	}
}