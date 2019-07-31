package ThreadsAndCollection;

import java.util.Random;
import java.util.Scanner;

class Number extends Thread{
public void run(){
	Scanner in = new Scanner(System.in);
	int number=in.nextInt();
	int fact=1;
	Random r=new Random();
	int value=r.nextInt(number);
	System.out.println("Random value:"+value);
	for(int i=1;i<=number;i++){
		fact=fact*i;
	}
	System.out.println(fact);
}
}
public class Factorial {

	public static void main(String[] args) {
		Number n=new Number();
		n.start();

	}

}
