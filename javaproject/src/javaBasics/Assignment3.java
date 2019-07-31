//Write a Java program to convert minutes into a number of years and days.
package javaBasics;
import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the minutes:");
		double minutes_in_year = 60 * 24 * 365;
		double minutes = in.nextDouble();
		long year = (long) (minutes / minutes_in_year);
		int days = (int) (minutes / 60 / 24) % 365;
		System.out.println("year:" + year + "\ndays:" + days);
	}
}
