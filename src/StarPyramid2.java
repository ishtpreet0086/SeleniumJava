
public class StarPyramid2 {

	public static void main(String[] args) {

//		*****
//		****
//		***
//		**
//		*
		
		String s = "*****";

		for (int i = 5; i >= 1; i--) {
			System.out.println(s);
			s= s.substring(1, i);
		}
	}

}
