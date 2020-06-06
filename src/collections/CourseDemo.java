package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Course implements Comparable<Course>{
	int courseId;
	private String courseName;
	public Course(int courseId, String courseName) {
		this.courseId = courseId;
		this.courseName = courseName;
	}
	public int compareTo(Course otherCourse) {
		return this.courseName.compareTo(otherCourse.courseName);
	}
	public String toString() {
		return this.courseId + ":" + this.courseName;
	}
}

class CourseIdComparator implements Comparator<Course>{

	@Override
	public int compare(Course c1, Course c2) {
		// TODO Auto-generated method stub
		return c1.courseId - c2.courseId;
	}
	
}
public class CourseDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Course> courseList = new ArrayList<Course>();
		courseList.add(new Course(124, "AngularJS"));
		courseList.add(new Course(120, "Java"));
		courseList.add(new Course(121, "Hibernate"));
		
//		Collections.sort(courseList);
		Collections.sort(courseList, new CourseIdComparator());
		System.out.println(courseList);
		
//		Set<Course> courseSet = new TreeSet<>();
//		courseSet.add(new Course(124, "AngularJS"));
//		courseSet.add(new Course(120, "Java"));
//		courseSet.add(new Course(121, "Hibernate"));
//		
//		System.out.println(courseSet);
		
		Set<Course> newCourseSet = new TreeSet<>(new CourseIdComparator());
		newCourseSet.add(new Course(124, "AngularJS"));
		newCourseSet.add(new Course(120, "Java"));
		newCourseSet.add(new Course(121, "Hibernate"));
		
		System.out.println(newCourseSet);
	}
}
