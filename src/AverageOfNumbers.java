
public class AverageOfNumbers {

	public static void main(String[] args) {

		// average of numbers from 30 to 60
		// (30+31+....60)/n
		int sum = 0;
		int count = 0;
		
		for (int i = 30; i <= 60; i++) {
			sum = sum + i;
			count = count + 1;
		}
		System.out.println(sum / count);
	}

}
