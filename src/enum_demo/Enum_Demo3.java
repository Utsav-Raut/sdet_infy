package enum_demo;

enum Day{
	SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);
	int value;
	Day(int value){
		this.value = value;
	}
	public int getValue() {
		return this.value;
	}
}
public class Enum_Demo3 {

	public static void main(String[] args) {
		for(Day day:Day.values()) {
			System.out.println("Day: "+day.name()+" Value: "+day.getValue());
		}

	}

}
