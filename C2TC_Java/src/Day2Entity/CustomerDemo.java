
package Day2Entity;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1=new Customer();
		
		System.out.println(c1);
		
		Customer c2=new Customer();
		c2.setCustomerId(15);
		c2.setCustomerName("Deva");
		c2.setCity("pondy");
		System.out.println(c2);
		
		System.out.println("Customer 1 city:"+c1.getCity()+"Customer 2 city:"+c2.getCity());
	}

}
