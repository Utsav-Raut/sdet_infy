package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class Course1{
	private String courseName;
	
	public Course1(String courseName) {
		this.courseName = courseName;
	}
	
	public String toString() {
		return this.courseName;
	}
}
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Course1> courseList = new ArrayList<Course1>();
		courseList.add(new Course1("Java"));
		courseList.add(new Course1("Hibernate"));
		courseList.add(new Course1("AngularJS"));
		
		System.out.println("Enhanced for-loop");
		for(Course1 c: courseList) {
			System.out.print(c + ", ");
		}
		System.out.println();
		System.out.println("Normal for loop");
		for(int i=0; i<courseList.size(); i++) {
			System.out.print(courseList.get(i)+", ");
		}
		System.out.println();
		System.out.println("Using Iterator");
		Iterator<Course1> courseIt = courseList.iterator();
		while(courseIt.hasNext()) {
			System.out.print(courseIt.next()+", ");
		}
		System.out.println();
		System.out.println("Using List Iterator");
		ListIterator<Course1> courseListIt = courseList.listIterator();
		while(courseListIt.hasNext()) {
			System.out.print(courseListIt.next()+", ");
		}
		System.out.println();
		System.out.println("going back");
		while(courseListIt.hasPrevious()) {
			System.out.print(courseListIt.previous()+", ");
		}
	}

}
