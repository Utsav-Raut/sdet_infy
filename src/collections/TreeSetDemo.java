package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> courseSet = new TreeSet<String>();
		courseSet.add("Java");
		courseSet.add("Hibernate");
		courseSet.add("AngularJS");
		
		Iterator<String> courseIt = courseSet.iterator();
		while(courseIt.hasNext())
			System.out.println(courseIt.next());
	}

}
