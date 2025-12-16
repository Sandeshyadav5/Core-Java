package in.co.rays.string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormating {
	
	public static void main(String[] args) throws ParseException {

		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		String formatedDate = sdf.format(date);
		System.out.println("FormatedDate  :"+formatedDate);
		System.out.println("---------------------------------");
		String Date1= "2001/09/05";
		System.out.println("Format date"+Date1);
		Date datess=sdf.parse(Date1);
		System.out.println("New"+datess);
		
		

	}
}
