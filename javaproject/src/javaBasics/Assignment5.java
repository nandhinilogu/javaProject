/*Write a program that will accept a 4 digit number(assume that the user enters only 4 digit nos.)
and print the sum of all the 4 digits. For ex : If the number passed is 3629, the program should
print “The sum of all the digits entered is 20”*/
package javaBasics;
public class Assignment5 {

	public static void main(String[] args) {
		int number = 3629, sum = 0;
		while (number > 0) {
			int reminder = number % 10;
			sum += reminder;
			number = number / 10;

		}
		System.out.println(sum);
	}

}
