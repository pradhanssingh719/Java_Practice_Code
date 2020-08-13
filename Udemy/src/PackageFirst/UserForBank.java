package PackageFirst;

public class UserForBank {

	public static void main(String[] args) {
		
		Bank obj;
		obj = new BankSBI();
		int sbiRate = obj.interestRate();
		
		obj = new BankPNB();
		int pnbRate = obj.interestRate();
		
		System.out.println(sbiRate);
		System.out.println(pnbRate);
		

	}

}
