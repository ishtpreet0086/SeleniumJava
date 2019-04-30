
public class FibonacciSeries {

	public static void main(String[] args) {

		// 0,1,1,2,3,5,8,13,21,34,55,89.....Fibonacci series
		int a = 0;
		int b = 1;

		System.out.println(a);
		System.out.println(b);

		for (int i = 1; i < 11; i++) {
			int c = a + b;
			System.out.println(c);

			a = b; // assign value of b to a so that 2nd number of Fibonacci series become 'a' now
			b = c; // assign value of c to b so that 3rd number of Fibonacci series become 'b' now
		}
	}

}
