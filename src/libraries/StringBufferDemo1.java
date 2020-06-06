package libraries;

public class StringBufferDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "Sachin";
		String lastName = "Tendulkar";
		String fullName = firstName + lastName;
//		+ operator concatenates two strings but creates a new object in the heap memory as string is immutable.
		
		System.out.println(fullName);
		
		StringBuffer sb = new StringBuffer(firstName);
		String fName = sb.append(lastName).toString();
//		String Buffer is mutable and hence it appends to a single object
		
		System.out.println(fName);
		
		
	}

}
