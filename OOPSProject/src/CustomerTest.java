
public class CustomerTest {
	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount(1258945621,"Sai","SBI058966","Hyd");
		
		BankAccount account2 = new BankAccount(1578945282,"Ram","SBI058799","PNB");
		
		BankAccount[] customerBankAccounts= {account1,account2};
		
		Customer customer = new Customer(7667,"Sai",customerBankAccounts);
		customer.displayCustomerDetails();
	}

}
