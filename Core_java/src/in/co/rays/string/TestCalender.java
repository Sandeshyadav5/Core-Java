package in.co.rays.string;
import java.util.Calendar;
import java.util.Date;

public class TestCalender {
	public static  void main(String[] args) {
		Date today=new Date();
		Calendar cal=Calendar.getInstance();
		cal.setTime(today);
		int dayOfYear =cal.get(Calendar.DAY_OF_YEAR);
	    cal.add(Calendar.DATE,-1);
	    Date yesterday=cal.getTime();
	    cal.add(Calendar.DATE, 30);
	    Date nextEvent=cal.getTime();
	    System.out.println(yesterday);

	}

}
 