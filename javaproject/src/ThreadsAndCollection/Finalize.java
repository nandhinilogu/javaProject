package ThreadsAndCollection;
class A{
	int i=10;

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method");
	}
	
}
public class Finalize {

	public static void main(String[] args) {
		A a=new A();
		a=new A();
		a=new A();
     System.gc();
	}

}
