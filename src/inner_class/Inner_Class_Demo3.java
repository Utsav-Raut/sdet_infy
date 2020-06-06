package inner_class;


public class Inner_Class_Demo3 {

	private String name;
	private Inner_Class_Demo3(String name) {
		this.name = name;
	}
	
	private class Account {
		private String accountNo = "name is empty";
		int count = 100;
		
		public String generateAccount() {
			if(!name.isEmpty()) {
				accountNo = "Acc" + count + 1;
			}
			return accountNo;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner_Class_Demo3 c = new Inner_Class_Demo3("John");
		Inner_Class_Demo3.Account acc = c.new Account();
		System.out.println(acc.generateAccount());

	}

}
