package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> numberSet = new LinkedHashSet<Integer>();
		numberSet.add(12);
		numberSet.add(24);
		numberSet.add(12);
		
		System.out.println(numberSet);
		System.out.println("Using iterator");
		Iterator<Integer> numberIt = numberSet.iterator();
		while(numberIt.hasNext()) {
			System.out.print(numberIt.next() + " ");
		}
	}

}
