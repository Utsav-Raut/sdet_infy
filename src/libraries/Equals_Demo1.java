package libraries;

public class Equals_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("HELLO");
		String s2 = new String("HELLO");
		String s3 = new String("Hello");
		String s4 = s3;
		
		System.out.println(s1);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equals(s3));
		
		System.out.println(s4.equals(s3));
		System.out.println(s4 == s3);

	}

}
