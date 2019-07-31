//Write a program to find greatest number in an array
package javaBasics;
import java.util.Arrays;

public class Assignment6 {

	public static void main(String[] args) {
		int array[]={55,44,22,33,11};
		int n=array.length;
		Arrays.sort(array);
		System.out.println(array[n-1]);

	}

}
