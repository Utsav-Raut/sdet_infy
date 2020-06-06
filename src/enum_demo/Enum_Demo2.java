package enum_demo;

enum Designation1{
	CEO(2), GeneralManager(4), RegionalManager(20), BranchManager(30);
	private int noOfEmployees;
	Designation1(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}
	public int getNoOfEmployees() {
		return this.noOfEmployees;
	}
	
}
public class Enum_Demo2 {

	public void reportees(Designation1 desig) {
		System.out.println(desig.getNoOfEmployees());
	}
	public static void main(String[] args) {
		Enum_Demo2 obj = new Enum_Demo2();
		obj.reportees(Designation1.CEO);

	}

}
