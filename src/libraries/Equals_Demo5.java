package libraries;
class Money {
    int amount;
    String currencyCode;
    Money(int amount, String currencyCode){
    	this.amount = amount;
    	this.currencyCode = currencyCode;
    }
}
public class Equals_Demo5 {

	public static void main(String[] args) {
		Money income = new Money(55, "USD");
		Money expenses = new Money(55, "USD");
		boolean bal = income.equals(expenses);
		System.out.println(bal);
	}

}
