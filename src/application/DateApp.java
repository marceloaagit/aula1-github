package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class DateApp {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1  = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2  = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y1 = sdf1.parse("25/01/2019");
		
		Date y2 = sdf2.parse("30/01/2019 23:24:22");
		
//		System.out.println(sdf1.format(y1));
//		System.out.println(sdf2.format(y2));
		
//		System.out.println(new Date());
		
//		System.out.println(new Date(System.currentTimeMillis()));
		
		System.out.println("Padrão UTC JAVA 8");
		System.out.println(Date.from(Instant.parse("2018-06-25T15:42:07Z")));
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		System.out.println(sdf3.format(Date.from(Instant.parse("2018-06-25T15:42:07Z"))));
		
	}
	

}
