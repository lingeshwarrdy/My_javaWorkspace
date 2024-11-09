
public class TypeCastingDemo {
	public static void main(String[] args) {
		int i=100;
		byte b=(byte)i;
		System.out.println("i = "+i);
		System.out.println("b = "+b);
		
		long l=1000L;
		int i2=(int)l;
		System.out.println("i2 = "+i2);
		
		double d=123.45;
		int i3=(int)d;
		System.out.println("i3 = "+i3);
		
		String s="10";
		int num =Integer.parseInt(s);
		System.out.println("s = "+s);
		System.out.println("Num = "+num);
		
		String s2 ="3.14";
		double dou =Double.parseDouble(s2);
		System.out.println("s2 = "+s2);
		System.out.println("D = "+dou);
		
		int num1=100;
		String s3=String.valueOf(num1);
		System.out.println("S3 = "+s3);
	}

}
