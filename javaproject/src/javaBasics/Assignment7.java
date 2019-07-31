//Write a Java program to calculate the factorial of a number without using any loop.
package javaBasics;
public class Assignment7 {

	public static void main(String[] args) {
		int number=5,factorial=1;
		for(int i=1;i<=number;i++){
			factorial=factorial*i;
		}
      System.out.println(factorial);
	}

}
