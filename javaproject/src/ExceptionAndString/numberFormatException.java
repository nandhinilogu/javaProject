package ExceptionAndString;

public class numberFormatException {

	public static void main(String[] args) {
		try{
		String name="sakthi";
		int i=Integer.parseInt(name);
        System.out.println(i);
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
	}

}
