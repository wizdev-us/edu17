package albert.kang.module01.thread;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BwgLockTutorial {
	public static void main(String[] args) {
		final Company bankware = new Company("Bankware");
		final Company google = new Company("Google");

		new Thread(new BankwareLoop(bankware, google)).start();
		new Thread(new BankwareLoop(google, bankware)).start();
	}
}

class BankwareLoop implements Runnable {
	private Company companyName1;
	private Company companyName2;

	public BankwareLoop(Company companyName1, Company companyName2) {
		this.companyName1 = companyName1;
		this.companyName2 = companyName2;
	}

	@Override
	public void run() {
		Random random = new Random();

		for (int counter = 0; counter < 5; counter++) {
			try {
				Thread.sleep(random.nextInt(5));
			} catch (InterruptedException e) {
			}
			companyName2.bwgTalking(companyName1);
		}
	}
}

class Company {
	private final String companyName;
	private final Lock lock = new ReentrantLock();

	public Company(String name) {
		this.companyName = name;
	}

	public String getName() {
		return this.companyName;
	}

	public boolean isTalking(Company companyName) {
		Boolean bankwareLock = false;
		Boolean googleLock = false;
		try {
			bankwareLock = lock.tryLock();
			googleLock = companyName.lock.tryLock();
		} finally {
			if (!(bankwareLock && googleLock)) {
				if (bankwareLock) {
					lock.unlock();
				}
				if (googleLock) {
					companyName.lock.unlock();
				}
			}
		}
		return bankwareLock && googleLock;
	}

	public void bwgTalking(Company companyName) {

		if (isTalking(companyName)) {
			try {
				System.out.format("I'm %s: talking to %s %n", this.companyName, companyName.getName());
			} finally {
				lock.unlock();
				companyName.lock.unlock();
			}
		} else {
			System.out.format("\tLock Situation ==> I'm %s: talking to %s, but it seems"
					+ " we are already talking. Conflicting. %n", this.companyName, companyName.getName());
		}
	}
}