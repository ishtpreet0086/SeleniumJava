
public class LcmOfNumbers1 {

	public static void main(String[] args) {

		// lcm of 72 and 80
		int i = 72;
		int j = 80;
		int k = i * j;
		int a = 0;

		if (i > j) {
			a = i;
		} else {
			a = j;
		}

		for (int n = a; n <= k; n++) {
			if (n % i == 0 && n % j == 0) {
				System.out.println("The LCM is: " + n);
				break;
			}
		}
	}
}
