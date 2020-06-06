package libraries;

class Customer4{
	private int custId;
	private String custName;
	
	public Customer4(int custId, String custName) {
		this.custId = custId;
		this.custName = custName;
	}
	
	public int hashCode() {
		return custId;
	}
	
	public boolean equals(Object o) {
		Customer4 cust = (Customer4) o;
		if(this.hashCode() == cust.hashCode()) {
			return this.custName.equals(cust.custName);
		}
		return false;
	}
}
public class Equals_Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer4 cust1 = new Customer4(12, "Tom");
		Customer4 cust2 = new Customer4(12, "Tom");
		if(cust1.equals(cust2)) {
			System.out.println("Objects are equal");
		}
		else {
			System.out.println("Objects are not equal");
		}
	}

}
