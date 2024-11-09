
public class BankAccount {
	long accountNo;
	String name;
	String ifsc;
	String branch;
	
	public BankAccount(long accountNo, String name, String ifsc, String branch) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.ifsc = ifsc;
		this.branch = branch;
	}
	
	public void dispayAccountDetails() {
		System.out.println(" Account No : "+accountNo );
		System.out.println(" Account Holder Name : "+name );
		System.out.println(" IFSC : "+ifsc );
		System.out.println(" Branch : "+branch );
	}

}
