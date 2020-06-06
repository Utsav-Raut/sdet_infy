package inner_class;

class Manager2{
	private class Grade2{
		private char grade;
		
		private char calculateGrade(String employeeID, int point) {
			if(isEmployeeExists(employeeID)) {
				if(point <100 && point >=90) {
					grade = 'A';
				}else if(point <90 && point >=80) {
					grade = 'B';
				}else {
					grade = 'C';
				}
			}
			return grade;
		}
	}
	private boolean isEmployeeExists(String employeeID) {
		return true;
	}
	public char checkEmployeeID(String employeeID, int point) {
		Grade2 grade = new Grade2();
		return grade.calculateGrade(employeeID, point);
	}
}
public class Inner_Class_Demo2 {

	public static void main(String[] args) {
		Manager2 manager = new Manager2();
		String employeeID = "I1001";
		char gradePoint = manager.checkEmployeeID(employeeID, 80);
		System.out.println("The grade for " + employeeID + " is : " + gradePoint);

	}

}
