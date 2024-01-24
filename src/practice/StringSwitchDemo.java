package practice;

public class StringSwitchDemo {
	public static void main(String[] args) {
		String month = "April";
		StringSwitchDemo demo = new StringSwitchDemo();
		System.out.println(demo.getMonthNumber(month));
	}


	public  int getMonthNumber(String month) {
		
		int monthNumber = 0;
		
		if(month == null) {
			return monthNumber;
		}
		
		switch (month.toLowerCase()) {
		case "January": 
			monthNumber = 1;
			break;
		case "february": 
			monthNumber = 2;
			break;
		case "march": 
			monthNumber = 3;
			break;
		case "april": 
			monthNumber = 4;
			break;
		case "may": 
			monthNumber = 5;
			break;
		case "June": 
			monthNumber = 6;
			break;
		case "July": 
			monthNumber = 7;
			break;
		case "August": 
			monthNumber = 8;
			break;
		case "Septembr": 
			monthNumber = 9;
			break;
		case "October": 
			monthNumber = 10;
			break;
		case "November": 
			monthNumber = 11;
			break;
		case "December": 
			monthNumber = 12;
			break;
			
		default:
			monthNumber = 0;
			break;
		}
		return monthNumber;

	}
}

