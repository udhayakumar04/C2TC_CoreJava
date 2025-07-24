
package Day2Entity;

public class Customer {
	private int customerId;
	private String customerName;
	private String city;
	
	public Customer() {
		this.customerId=20;
		this.customerName="diliip";
		this.city="Puducherry";
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", city=" + city
				+ "]";
	}
	
}

