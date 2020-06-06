package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class CourseMap{
	private String courseName;
	
	public CourseMap(String courseName) {
		this.courseName = courseName;
	}
	
	public String toString() {
		return this.courseName;
	}
}
public class MapInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<CourseMap> courseSet1 = new HashSet<>();
		courseSet1.add(new CourseMap("Java"));
		courseSet1.add(new CourseMap("DBMS"));
		
		Set<CourseMap> courseSet2 = new HashSet<>();
		courseSet2.add(new CourseMap("PHP"));
		courseSet2.add(new CourseMap("HTML"));
		courseSet2.add(new CourseMap("CSS"));
		
		Map<Integer, Set<CourseMap>> studentCourses = new HashMap<Integer, Set<CourseMap>>();
		studentCourses.put(1001, courseSet1);
		studentCourses.put(1002, courseSet2);
		
		Set<CourseMap> courseSet = studentCourses.get(1001);
		System.out.println("Retrieving the set of courses using the StudentId");
		System.out.println(courseSet);
		
		Set<Integer> setOfKeys = studentCourses.keySet();
		System.out.println("Iterating over the set of keys using the for-each loop :");
		for(Integer i: setOfKeys) {
			System.out.println(studentCourses.get(i));
		}
		
		
		System.out.println("Iterating over the collection using the values method: ");
		for(Set<CourseMap> courseSett: studentCourses.values()) {
			System.out.println(courseSett);
		}
	}

}

//Collections.sort(companies);
//Collections.shuffle(companies);
//Collections.reverse(companies);
//Collections.swap(companies, 0, 2);
