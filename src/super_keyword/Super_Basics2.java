package super_keyword;

class Super_Base2{
	int tenure;
	double principle;
	float interestRate;
	String accountNumber;
	
	Super_Base2(){
		this.tenure = 10;
		this.principle = 200000;
		this.interestRate = 1.4f;
		this.accountNumber = "A1";
	}
	Super_Base2(int tenure, double principle, float interestRate, String accountNumber){
		this.tenure = tenure;
		this.principle = principle;
		this.interestRate = interestRate;
		this.accountNumber = accountNumber;
	}
	public void printDetails() {
		System.out.println(this.tenure+" months tenure, "+this.principle+" is the principle.");
		System.out.println("The interest rate is: "+this.interestRate+" and account no is "+this.accountNumber+".");
	}
	
}

public class Super_Basics2 extends Super_Base2{

	double principle;
	Super_Basics2(){
		this.principle = 95000;
	}
	Super_Basics2(double principle){
		super();
		this.principle = principle;
	}
	Super_Basics2(int ten, double prin, float intRt, String acctNo, double principle){
		super(ten, prin, intRt, acctNo);
		this.principle = principle;
		
	}
	public static void main(String[] args) {
		Super_Basics2 obj1 = new Super_Basics2();
		Super_Basics2 obj2 = new Super_Basics2(45000);
		Super_Basics2 obj3 = new Super_Basics2(6, 4500000, 2.5f, "ZEN1001", 559558);
		System.out.println(obj1.principle);
		obj1.printDetails();
		System.out.println(obj2.principle);
		obj3.printDetails();
		System.out.println(obj3.principle);

	}

}
