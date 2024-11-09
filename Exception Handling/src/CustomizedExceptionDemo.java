
//Unchecked Exception
class InvalidAgeException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public InvalidAgeException() {
		super();
	}
	
	public InvalidAgeException(String message) {
		super(message);
	}
}

//Checked Exception

class InvalidIncomeException extends Exception{
	
	private static final long serialVersionUID = 1L;
	public InvalidIncomeException() {
		super();
	}
	public InvalidIncomeException(String message) {
		super(message);
	}
}

public class CustomizedExceptionDemo {
	
	public static void checkVoterAge(int age) {
		if(age >= 18) {
			System.out.println(" Congrats ! You are eligible to Vote");
		}
		else {
			throw new InvalidAgeException("Not Eligible to vote");
		}
	}
	
	public static void checkIncome(int income) throws InvalidIncomeException {
		if(income <=800000) {
			System.out.println("Eligible to enroll for JFS Course ");
		}
		else {
			throw new InvalidIncomeException("Not Eligible for JFS Course");
		}
	}
	
	public static void main(String[] args) {
		try {
			checkVoterAge(10);
		} catch (InvalidAgeException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
			checkIncome(50000000);
		} catch (InvalidIncomeException e) {
			System.out.println(e);
			//System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
	}

}
