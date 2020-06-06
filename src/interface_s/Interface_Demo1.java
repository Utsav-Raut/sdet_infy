package interface_s;

interface IBankNew {
	boolean applyForCreditCard(Customer customer);
}
interface IBank extends IBankNew{
	int CAUTION_MONEY = 2000;
	String createAccount(Customer customer);
	double issueVehicleLoan(String vehicleType, Customer customer);
	double issueHouseLoan(Customer customer);
	double issueGoldLoan(Customer customer);
}

class Customer{
	private String name;
	private String customerId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
}

class MumbaiBranch implements IBank {

	@Override
	public String createAccount(Customer customer) {
		return "Acc12345";
	}

	@Override
	public double issueVehicleLoan(String vehicleType, Customer customer) {
		if(vehicleType.equals("bike")){
			return 10000;
		}
		else {
			return 50000;
		}
	}

	@Override
	public double issueHouseLoan(Customer customer) {
		return 2000000;
	}

	@Override
	public double issueGoldLoan(Customer customer) {
		return 5000000;
	}

	@Override
	public boolean applyForCreditCard(Customer customer) {
		return true;
	}
	
}
public class Interface_Demo1 {

	public static void main(String[] args) {
		IBank bank = new MumbaiBranch();
		Customer customer = new Customer();
		customer.setCustomerId("cust1001");
		customer.setName("Ashok");
		String accountNumber = bank.createAccount(customer);
		System.out.println("The account number is : "+accountNumber);
		double gLoan = bank.issueGoldLoan(customer);
		System.out.println("The gold loan is : "+gLoan);
		double hloan = bank.issueHouseLoan(customer);
		System.out.println("The house loan is : "+hloan);
		double vloan = bank.issueVehicleLoan("bike", customer);
		System.out.println("The vehicle loan is : "+vloan);
		System.out.println("Caution money is : "+IBank.CAUTION_MONEY);
		IBankNew bank1 = new MumbaiBranch();
		boolean credit = bank1.applyForCreditCard(customer);
		System.out.println("Credit card required : "+credit);
	}

}
