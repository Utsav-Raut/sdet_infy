package operators;

public class Lonely_Integer {

	public static int findLonelyInteger(int input[]) {
		int result = 0;
		for(int val : input) {
			result ^= val;	//X-OR operation
		}
		return result;
	}
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 4, 9, 9, 4, 1};
		int output = findLonelyInteger(arr);
		System.out.println(output);

	}

}
