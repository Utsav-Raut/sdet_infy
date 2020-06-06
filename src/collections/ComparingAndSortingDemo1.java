package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparingAndSortingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> companies = new ArrayList<String>();
		companies.add("IBM");
		companies.add("Google");
		companies.add("Microsoft");
		System.out.println(companies);
//		Collections.sort(companies);
//		Collections.shuffle(companies);
//		Collections.reverse(companies);
		Collections.swap(companies, 0, 2);
		System.out.println(companies);
	}
}
