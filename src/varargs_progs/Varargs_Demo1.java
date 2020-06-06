package varargs_progs;

import java.util.Arrays;

public class Varargs_Demo1 {

	public static String[] fdDetails(int...number) {
		String[] value = new String[number.length];
		int j = 0;
		for(int i: number) {
			System.out.println("Retrieving FD details for FD number "+i);
			value[j] = "" + i;
			j++;
		}
		return value;
	}
	public static void main(String[] args) {
		String[] str = fdDetails(111, 123);
		System.out.println(Arrays.toString(str));
		String[] str1 = fdDetails(555555, 666666, 7777777);
		System.out.println(Arrays.toString(str1));

	}

}
