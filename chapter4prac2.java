
public class chapter4prac2 {
	public static void zool(int c, String a, String b) {
		System.out.print(c);
		System.out.print(a);
		System.out.print(b);
	}
	public static void main(String[]args) {
		int c=11;
		String a="当当";
		String b="中山一路";
		zool(c, a, b);
		String day="Thursday";
		String month="September ";
		int date=22;
		int year=2018;
		printAmerican(day, month, date, year);
	}
	public static void printAmerican(String day, String month, int date, int year) {
		System.out.print(day);
		System.out.print(", ");
		System.out.print(month);
		System.out.print(date);
		System.out.print(", ");
		System.out.print(year);
	}
}