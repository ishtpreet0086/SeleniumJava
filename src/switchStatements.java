
public class switchStatements {
	public static void main(String[] args){
		
		String days = "Friday";
		
		switch (days) {
		case "Monday":
			System.out.println("Today is Monday");
			break;
		case "Tuesday":
			System.out.println("Today is Tuesday");
			break;
		case "Wednesday":
			System.out.println("Today is Wednesday");
			break;
		default: 
			System.out.println("Other days of the week");
		}
	}
}
