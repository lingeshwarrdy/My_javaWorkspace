
public class Address {
	String city,state,country;
	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public void displayAddress()
	{
		System.out.println("city :"+    city);
		System.out.println("state :"+   state);
		System.out.println("country :"+ country);
	}
 
}
