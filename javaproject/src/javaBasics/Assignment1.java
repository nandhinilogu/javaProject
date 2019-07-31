/*Write a java program to display “Welcome to Java Programming” and then print your name on a
separate line*/
package javaBasics;
public class Assignment1 {

	public static void main(String[] args) {
		String s = "Welcome to java programming";
		String arr[] = s.split("\\s");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
