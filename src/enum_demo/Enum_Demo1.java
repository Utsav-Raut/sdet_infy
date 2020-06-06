package enum_demo;

enum Designation{
	CEO, GeneralManager, RegionalManager, BranchManager
}

class Bank{
	public void roleDefined(Designation designation) {
		switch(designation) {
		case CEO:
			System.out.println("Role of CEO");
			break;
		case GeneralManager:
			System.out.println("Role of GM");
			break;
		case RegionalManager:
			System.out.println("Role of RM");
			break;
		case BranchManager:
			System.out.println("Role of BM");
			break;
		}
			
	}
}
public class Enum_Demo1 {

	public static void main(String[] args) {
		Bank obj1 = new Bank();
		obj1.roleDefined(Designation.CEO);

	}

}
