package Assignment_13;
import java.util.HashMap;
import java.util.Scanner;
public class dates {
	
	

		static HashMap<String, String> date = new HashMap<String, String>();
		static HashMap<String, String> month = new HashMap<String, String>();
		static HashMap<String, String> yy1 = new HashMap<String, String>();
		static HashMap<String, String> yy2 = new HashMap<String, String>();
		
		public static void printDate() {
			date.put("01", "First");
			date.put("02", "Second");
			date.put("03", "Third");
			date.put("04", "Fourth");
			date.put("05", "Fifth");
			date.put("06", "Sixth");
			date.put("07", "Seventh");
			date.put("08", "Eight");
			date.put("09", "Ninth");
			date.put("10", "Tenth");
			date.put("11", "Eleventh");
			date.put("12", "Tweleveth");
			date.put("13", "Thirteenth");
			date.put("14", "Fourteenth");
			date.put("15", "Fifteenth");
			date.put("16", "Sixteenth");
			date.put("17", "Seventeenth");
			date.put("18", "Eighteenth");
			date.put("19", "Nineteenth");
			date.put("20", "Twenty");
			date.put("21", "Twenty First");
			date.put("22", "Twenty Second");
			date.put("23", "Twenty Third");
			date.put("24", "Twenty Fourth");
			date.put("25", "Twent Fifth");
			date.put("26", "Twenty Sixth");
			date.put("27", "Twenty Seventh");
			date.put("28", "Twenty Eighth");
			date.put("29", "Twenty Nineth");
			date.put("30", "Thirty");
			date.put("31", "Thirty First");
			
			month.put("01", "January");
			month.put("02", "February");
			month.put("03", "March");
			month.put("04", "April");
			month.put("05", "May");
			month.put("06", "June");
			month.put("07", "July");
			month.put("08", "August");
			month.put("09", "September");
			month.put("10", "October");
			month.put("11", "November");
			month.put("12", "December");
			
			yy1.put("20", "Two Thousand");
			yy1.put("19", "Nineteen Hundred");
			
			yy2.put("01", "one");
			yy2.put("02", "Two");
			yy2.put("03", "Three");
			yy2.put("04", "Four");
			yy2.put("05", "Five");
			yy2.put("06", "Six");
			yy2.put("07", "Seven");
			yy2.put("08", "Eight");
			yy2.put("09", "Nine");
			yy2.put("10", "Ten");
			yy2.put("11", "Eleven");
			yy2.put("12", "Twelve");
			yy2.put("13", "Thirteen");
			yy2.put("14", "Fourteen");
			yy2.put("15", "Fifteen");
			yy2.put("16", "Sixteen");
			yy2.put("17", "Seventeen");
			yy2.put("18", "Eighteen");
			yy2.put("19", "Nineteen");
			yy2.put("20", "Twenty");
			yy2.put("21", "Twenty One");
			yy2.put("22", "Twenty Two");
			yy2.put("23", "Twenty Three");
			yy2.put("24", "Twenty Four");
			yy2.put("25", "Twenty Five");
			yy2.put("26", "Twenty Six");
			yy2.put("27", "Twenty Seven");
			yy2.put("28", "Twenty Eight");
			yy2.put("29", "Twenty Nine");
			yy2.put("30", "Thirty");
			}
		public static void main(String[] args) {
			printDate();
			System.out.println("Enter date in dd-mm-yy format");
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			sc.close();
			System.out.println(str);
			System.out.println(convertDate(str));
		}
		public static String convertDate(String date1) {
			String dd = date1.substring(0, 2);
			String mm = date1.substring(3,5);
			String year1 = date1.substring(6,8);
			String year2 = date1.substring(8,10);
			return date.get(dd) + " " + month.get(mm) + " " + yy1.get(year1) + " " + yy2.get(year2);
		}

	}

