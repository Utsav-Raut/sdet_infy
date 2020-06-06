package generics;

import java.util.ArrayList;
import java.util.List;

class Record<E>{
	List<E> record = new ArrayList<E>();
	
	public String toString() {
		return "Record [record = "  + record + "]";
	}
	
	public void add(E e) {
		record.add(e);
	}
	
	public void display(Record<? extends Student> record) {
		System.out.println("student record : "+record);
	}
}
class Student{
	int id;
	String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return "Id = " + id + " Name = " + name;
	}
}

class DayScholar extends Student{
	float stipend;
	public DayScholar(int id, String name, float stipend) {
		super(id, name);
		this.stipend = stipend;
	}
	
	public String toString() {
		return "Id = " + id + " Name = " + name + " Stipend = " + stipend;
	}
}
public class WildCardsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Record<Student> studentRecord = new Record<Student>();
		Student student = new Student(101, "Adam");
		
		Record<DayScholar> dayScholarRecord = new Record<DayScholar>();
		DayScholar dayScholar = new DayScholar(102, "Robet", 10000f);
		
		studentRecord.add(student);
		studentRecord.display(studentRecord);
		
		dayScholarRecord.add(dayScholar);
		dayScholarRecord.display(dayScholarRecord);
	}

}
