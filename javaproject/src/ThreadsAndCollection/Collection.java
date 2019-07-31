package ThreadsAndCollection;

import java.util.ArrayList;
import java.util.Scanner;

class Employee{
	int eCode;

	public int geteCode() {
		return eCode;
	}

	public void seteCode(int eCode) {
		this.eCode = eCode;
	};

	
}
class EmployeeDB extends Employee{
	ArrayList<Integer> list=new ArrayList<Integer>();
	boolean addEmployee(Employee emp){
		emp=new Employee();
		emp.seteCode(12);
		return list.add(emp.geteCode());
		
	}
	Integer deleteEmployee(int ecode){
		 list.add(ecode);
		return list.remove(0);
	}
	void showSlip(){
		System.out.println(list);
	}
	
}
public class Collection {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		EmployeeDB e=new EmployeeDB();
		e.addEmployee(e);
		int ecode=in.nextInt();
		e.deleteEmployee(ecode);
		e.showSlip();
        
	}

}
