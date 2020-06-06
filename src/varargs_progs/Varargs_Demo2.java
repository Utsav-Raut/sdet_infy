package varargs_progs;

class Employee{
	private String employeeId;
	Employee(String employeeId){
		this.employeeId = employeeId;
	}
	
	public int reward(double...fixedDeposits) {
		int rewardPoint = 0;
		double sum = 0;
		for(double deposit:fixedDeposits) {
			sum += deposit;
		}
		if(sum>1000000) {
			rewardPoint = 2000;
		}else if(sum<1000000 && sum >=500000) {
			rewardPoint = 1000;
		}
		return rewardPoint;
	}
	public String getEmployeeId() {
		return this.employeeId;
	}
}
public class Varargs_Demo2 {

	public static void main(String[] args) {
		Employee emp1 = new Employee("E1001");
		int rewardPoint = emp1.reward(100000, 200000, 300000);
		Employee emp2 = new Employee("E2001");
		int rewardPoint1 = emp1.reward(100000, 1000000);
		System.out.println(emp1.getEmployeeId()+" has got a reward of "+rewardPoint);
		System.out.println(emp2.getEmployeeId()+" has got a reward of "+rewardPoint1);

	}

}
