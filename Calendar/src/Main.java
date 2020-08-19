import java.sql.Date;
import java.text.ParseException;
import java.time.Instant;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) throws ParseException {
		java.util.Date data =  Date.from(Instant.parse("2018-06-25T16:43:06Z"));
		
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.HOUR_OF_DAY, 5);
		data = cal.getTime();
		
		System.out.println(data);
		
		
		
	}

}
