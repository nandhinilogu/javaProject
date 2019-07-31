package ExceptionAndString;

public class Stringpalindrome {

	public static void main(String[] args) {
		String name = "Malayalam";
		String str = name.toLowerCase();
		StringBuilder sb = new StringBuilder(str);
		String rev = sb.reverse().toString();
		if (str.equals(rev)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}

}
