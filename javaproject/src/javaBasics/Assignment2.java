/*Write a Java program to print the result of the following operations. Declare variables and
initialize them with given values
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3*/
package javaBasics;
public class Assignment2 {
	public static void main(String[] args) {
		int a = 5, b = 8, c = 6;
		System.out.println(-a + b * c);
		int d = 55, e = 9;
		System.out.println((d + e) % e);
		int f = 20, g = 3, h = 8;
		System.out.println(f + -g * a / h);
		int i = 15, j = 2;
		System.out.println(a + i / g * j - h % g);
	}
}
