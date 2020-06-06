package generics;

class Record1<E>{
	private E record;
	
	public void display(E item) {
		System.out.println(item);
	}
}

class Student1{
	private int studentId;
	private String studentName;
	
	public Student1(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public String toString() {
		return "Student Id: " + this.studentId + " Student Name: " + this.studentName;
	}
}
public class GenericsDemo {

	public static void main(String[] args) {
		Student1 s1 = new Student1(1001, "Tom");
		Record1<Integer> integerRecord = new Record1<Integer>();
		integerRecord.display(12);
		
		Record1<Student1> studentRecord = new Record1<Student1>(); 
		studentRecord.display(s1);
	}

}
