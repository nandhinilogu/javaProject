package ExceptionAndString;

import java.util.Scanner;
public class userException {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name;
		int age=in.nextInt();
		try{
			if(age>=18 && age<60){
				System.out.println(age);
			}
			else{
				throw new Exception();
			}
			
		}catch(Exception e){
			System.out.println("Invalid");
		}
		

	}

}
