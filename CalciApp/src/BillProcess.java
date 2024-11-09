
public class BillProcess {
	public void displayFinalBill(int totalBillAmount) {
		
		
		DiscountCalci calc = new DiscountCalci();
		double discount =calc.findDiscount(totalBillAmount);
		
		System.out.println("Bill Amount : "+ totalBillAmount);
		System.out.println(" Discount : "+ discount);
		System.out.println("Final Bill Amount : "+ (totalBillAmount-discount));
		
	}
	
	}
	



