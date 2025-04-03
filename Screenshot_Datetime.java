package package123;

import java.util.Date;

public class Screenshot_Datetime {

	public static void main(String[] args) 
	{
		Date d1= new Date();
		System.out.println(d1.getTime());
		
		Date d2= new Date();
		System.out.println(d2);
		
	String date1= 	d2.toString();
	//Date/month/year
	String month =date1.substring(4, 7);
	System.out.println(month);
	String date =date1.substring(8, 10);
	System.out.println(date);
	String year =date1.substring(date1.length()-4);
	System.out.println(year);
	String date2 = date.concat(month).concat(year);
	System.out.println(date2);
	String date3 = date.concat("/").concat(month).concat("/").concat(year);
	System.out.println(date3);
	
		
		
	}

}
