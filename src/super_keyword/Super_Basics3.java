package super_keyword;

class Super_Base3{
	Super_Base3(){
		System.out.println("Hi From Base class...");
	}
}
public class Super_Basics3 extends Super_Base3{

	Super_Basics3(){
		System.out.println("Hi from child class");
	}
	public static void main(String[] args) {
		Super_Basics3 obj = new Super_Basics3();
		System.out.println("Hi");
		System.out.println(obj);

	}

}
