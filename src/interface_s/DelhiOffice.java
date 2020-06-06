package interface_s;

interface IBank1{
	void withdraw();
	void deposit();
}
abstract class Office implements IBank1{

	public void withdraw() {
		System.out.println("Amount withdrawal");
	}
}

public class DelhiOffice extends Office{
	
	public void deposit() {
		System.out.println("Amount deposit");
	}

	public static void main(String[] args) {
		IBank1 bank = new DelhiOffice();
		bank.deposit();
		bank.withdraw();
	}

}
