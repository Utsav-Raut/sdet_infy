package inner_class;

class Manager1 {
	class Grade1 {
		private char grade;
		public char calculateGrade(String employeeID, int point) {
			return grade;
		}
	}
	
	public char checkEmployeeID(String employeeID, int point) {
		Grade1 grade = new Grade1();
		return grade.calculateGrade(employeeID, point);
	}
}
public class Inner_Class_Demo1 {

	public static void main(String[] args) {
		Manager1 manager = new Manager1();
		Manager1.Grade1 grade = manager.new Grade1(); //Instantiating new class from outside
		
		grade.calculateGrade("Emp-001", 65);  // Accessing the inner class method

	}

}
