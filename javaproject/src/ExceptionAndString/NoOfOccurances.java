package ExceptionAndString;

public class NoOfOccurances {

	public static void main(String[] args) {
		String str = "How was your day today";
		char c = 'a';
		int count = 0;
		String s = str.replaceAll(" ", "");
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				count++;

			}

		}
		System.out.println(count);
	}

}
