import java.util.Scanner;

public class ATMApp {
	public static void main(String[] args) throws InterruptedException {
		ATMService service = new ATMService();
		Scanner sc =new Scanner(System.in);
		int option =0;
		
		do {
			System.out.println("XYZ ATM APP : ");
			System.out.println(" ---------------------- ");
			System.out.println(" 1. Deposit ");
			System.out.println(" 2. Withdraw");
			System.out.println(" 3. Balance ");
			System.out.println(" 0. Exit ");
			System.out.println(" Please Choose Option : ");
			option = sc.nextInt();
			
			switch(option) {
			case 1 :
				
				System.out.println(" Enter Deposit Amount : ");
				int depositAmount =sc.nextInt();
				//service.balance =service.balance+depositAmount;
				service.deposit(depositAmount);
			    System.out.println(" Deposit Sucessfull ! ");
				break;
				
			case 2 :
				
				System.out.println(" Enter Withdraw Amount : ");
				int withdrawAmount =sc.nextInt();
				if(withdrawAmount > service.balance()) {
					
					System.out.println(" Insufficient Balance !");
				}
				else if (withdrawAmount <100) {
					System.out.println(" Minimum withdrawl amount is 100 ");
				}
				else {
					System.out.println("Withdrawl is Processing.....");
					 /*try {
							Thread.sleep(1000);
					}
					catch{InterruptedException e){
						e.printStackTrace();
					} */
					
					Thread.sleep(1000);  // We need to write this thread in try if we use try& catch instead of (throws InterruptedException in main method)
				    service.withdraw(withdrawAmount);
				    System.out.println( withdrawAmount+" Withdrawl is Sucessfull ! ");
				}
				break;
				
			case 3 :
				
				int balance = service.balance();
				System.out.println(" Balance : " + balance);
				break;
				
			case 0 :
			    System.out.println(" Bye !!! ");
			    System.exit(0);
			    
			default : 
				System.out.println(" Invalid Option");
			break;
			}
		}while(option !=0);
	}

}
