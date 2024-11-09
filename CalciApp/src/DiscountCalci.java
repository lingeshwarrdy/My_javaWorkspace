public class DiscountCalci {
	public double findDiscount(int totalBillAmount) {
		double discount =0.0;
		
		if(totalBillAmount <100) {
			
			discount = totalBillAmount *0.05;
		}
		else if(totalBillAmount < 250){
			discount=totalBillAmount *0.1;
		}
		else if (totalBillAmount < 500) {
			discount =totalBillAmount *0.15;
		}
		else if (totalBillAmount <750) {
			discount = totalBillAmount *0.2;
		}
		else if (totalBillAmount < 1000) {
			discount =totalBillAmount *0.25;
		}
		else {
			discount =totalBillAmount*0.3;
			
		}
		return discount;
		
	}
}
