package t1;
import java.util.Date;

public class DateObject {
	public static void main(String[] args) {
	Date date1 = new Date(10000);
	Date date2 = new Date(100000);
	Date date3 = new Date(1000000);
	Date date4 = new Date(10000000);
	Date date5 = new Date(100000000);
	Date date6 = new Date(1000000000);
	Date date7 = new Date(10000000000L);
	Date date8 = new Date(100000000000L);
	
	System.out.println(date1.toString());
	System.out.println(date2.toString());
	System.out.println(date3.toString());
	System.out.println(date4.toString());
	System.out.println(date5.toString());
	System.out.println(date6.toString());
	System.out.println(date7.toString());
	System.out.println(date8.toString());
	
	
	}
}
