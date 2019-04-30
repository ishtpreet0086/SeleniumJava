
public class GcdOfNumbers {

	public static void main(String[] args) {

		int i = 81;
		int j = 153;

		int k = 0;

		if (i < j) {
			k = i;
		} else {
			k = j;
		}

		for (int n = k; n >= 1; n--) {
			if (i % n == 0 && j % n == 0) {
				System.out.println("GCD is: " + n);
				break;
			}
		}
	}
}
