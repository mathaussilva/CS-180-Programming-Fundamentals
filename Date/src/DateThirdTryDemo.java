public class DateThirdTryDemo {
	
	public static void main(String[] args)
	   {
	        DateThirdTry date = new DateThirdTry(  );
	        
	        date.setDate(10, 30, 2020);
	        
	        int day = date.getDay();
	        int month = date.getMonth();
	        int year = date.getYear();
	        
	        System.out.println("Today's date is " + month + "/" + day + "/" + year);
	        
	        DateThirdTry dateChristmas = new DateThirdTry();
	        
	        date.setDate(12, 25, 2020);
	        
	        int day2 = date.getDay();
	        int month2 = date.getMonth();
	        int year2 = date.getYear();
	        
	        System.out.println("Today's Christmas! " + month2 + "/" + day2 + "/" + year2);
	        
	     }

}
