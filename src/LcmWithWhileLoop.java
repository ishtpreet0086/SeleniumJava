
public class LcmWithWhileLoop {

	public static void main(String[] args) {

		int i = 72;
		int j = 80;
		int k = i * j;
		int a = 0;

		if (i > j) {
			a = i;
		} else {
			a = j;
		}

		int n = a;
		while (n <= k) {
			if (n % i == 0 && n % j == 0) {
				System.out.println("The LCM is: " + n);
				break;
			}
			n++;
		}
	}
}
