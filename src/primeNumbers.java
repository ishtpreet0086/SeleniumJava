
public class primeNumbers {

	public static void main(String[] args) {
		
		for (int i = 2; i < 50; i++) {
			boolean primeNumber = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					//System.out.println(i + " is not prime");
					primeNumber = false;
					break;
				}
			} if (primeNumber == true){
				System.out.println(i);
			}
		}
	}
}
// one integer iterate from  to 50
// another integer iterate from 2 to i-1
