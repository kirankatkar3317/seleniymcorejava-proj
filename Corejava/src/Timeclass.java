import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Timeclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		
		System.out.println(d.toString());
		System.out.println(sdf.format(d));
		System.out.println(sdf1.format(d));
		
		
		Calendar cal = Calendar.getInstance();
		System.out.println(sdf1.format(cal.getTime()));
		System.out.println(cal.getTime());		
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	}

}
