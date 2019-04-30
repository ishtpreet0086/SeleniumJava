
public class StarPyramid1 {

	public static void main(String[] args) {

		// *
		// **
		// ***
		// ****
		// *****

		String s = "*";

		for (int i = 1; i <= 5; i++) {
			System.out.println(s);
			s = s + "*";
		}
	}

}
