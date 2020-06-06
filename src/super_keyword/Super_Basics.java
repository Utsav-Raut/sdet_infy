package super_keyword;

class Super_Base{
	int tenure;
	double principle;
	float interestRate;
	String accountNumber;
	
	Super_Base(){
		this.tenure = 10;
		this.principle = 200000;
		this.interestRate = 1.4f;
		this.accountNumber = "A1";
	}
	public void printDetails() {
		System.out.println(this.tenure+" months tenure, "+this.principle+" is the principle.");
		System.out.println("The interest rate is: "+this.interestRate+" and account no is "+this.accountNumber+".");
	}
	
}

public class Super_Basics extends Super_Base{

	double principle;
	Super_Basics(double principle){
		super();
		this.principle = principle;
		
	}
	public static void main(String[] args) {
		Super_Basics obj1 = new Super_Basics(45000);
		obj1.printDetails();
		System.out.println(obj1.principle);

	}

}
