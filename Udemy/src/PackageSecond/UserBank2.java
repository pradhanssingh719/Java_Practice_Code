package PackageSecond;

import PackageFirst.Bank;
import PackageFirst.BankPNB;
import PackageFirst.BankSBI;

public class UserBank2 {

	public static void main(String[] args) {
		Bank sbi;
		sbi = new BankSBI();
		int sbiRate = sbi.interestRate();
		
		sbi = new BankPNB();
		int pnbRate = sbi.interestRate();
		
		System.out.println(sbiRate);
		System.out.println(pnbRate);

	}

}
