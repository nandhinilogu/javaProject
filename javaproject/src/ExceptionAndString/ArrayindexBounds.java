package ExceptionAndString;

public class ArrayindexBounds {

	public static void main(String[] args) {
		try{
			int array[]={1,2,3,4};
			int n=array.length;
			System.out.println(array[n]);
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}

	}

}
