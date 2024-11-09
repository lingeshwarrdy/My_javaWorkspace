
public class InterfaceDemo {
	public static void main(String[] args) {
		
		EpsionPrinter ep =new EpsionPrinter();
		ep.printjob();
		
		ep.tshirtPrintJob();
		ep.coffeeCupPrintJob();
		
		System.out.println("------------------------------- \n");
		CanonPrinter cp =new CanonPrinter();
		cp.printjob();
		
		cp.tshirtPrintJob();
		cp.coffeeCupPrintJob();
		
		System.out.println("------------------- -----------------\n ");
		HpPrinter hp = new HpPrinter();
		hp.printjob();
		
		hp.tshirtPrintJob();
		hp.coffeeCupPrintJob();
		
		System.out.println("------------------------------------- \n");
		Printer p =new CanonPrinter(); // Interface can be used as reference type but not as value type
		p.printjob();
		
		p.tshirtPrintJob();
		p.coffeeCupPrintJob();
		
		System.out.println("------------------------------------- \n");
		
		Printer.threeDPrintJob();
		
	}

}
