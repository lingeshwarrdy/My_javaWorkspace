
public class Customer {
	private int customerID;
	private String customerName;
	BankAccount[] customerBankAccounts;
	
	
	public Customer(int customerID, String customerName, BankAccount[] customerBankAccounts) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerBankAccounts = customerBankAccounts;
	}
	
	public void displayCustomerDetails() {
		System.out.println(" Customer Details :");
		System.out.println("---------------");
		System.out.println(" customerID  : "+customerID );
		System.out.println(" customerID Name  : "+customerName );
		
		System.out.println(" Customer Bank Account Details :");
		System.out.println("----------");
		
		for(BankAccount account : customerBankAccounts) {
			account.dispayAccountDetails();
		}
	
	
	}
}
