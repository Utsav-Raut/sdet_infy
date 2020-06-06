package libraries;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = "Tendulkar";
		int size = username.length();
		
		if(size > 8 && size < 15) {
			char arr[] = username.toCharArray();
			System.out.println(arr);
			int count = 0;
			for(char c:arr) {
				System.out.print(c+", ");
				if(Character.isLetter(c)) {
					count++;
				}
			}
			System.out.println();
			if(count == size)
				System.out.println("Valid username");
		}

	}

}
