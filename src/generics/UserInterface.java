package generics;

public class UserInterface {

	public static <E> void display(E[] list) {
		for(int i=0; i<list.length; i++) {
			System.out.print(list[i]+", ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cities[] = {"Bangalore", "Kolkata"};
		Integer codes[] = {12,14,15};
		display(cities);
		display(codes);
	}

}
