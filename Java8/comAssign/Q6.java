//6.	Write a java class to calculate your experience (no.of years, no.of months &no.of days) in Wipro by using java time API.

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Q6{
    public static void main (String args[]) throws Exception {
	
        String joiningDate = "04-09-2019";
      // LocalDate test= LocalDate.parse("2019-09-04");
      DateTimeFormatter dff= DateTimeFormatter.ofPattern("dd-MM-yyyy");
      LocalDate test= LocalDate.parse("04-09-2019",dff);
       System.out.println("Another way to parse "+test.toString());
       System.out.println("Joining Date "+joiningDate);
       if(patternCheck(joiningDate)==true){
        LocalDate jDateformatted= formatDate(joiningDate);
        getDate(jDateformatted);
       }
        else{
            System.out.println("Check the date format. It would be in the format dd-mm-yyyy. etc 04-09-2019. Current date format is not supported "+joiningDate);
        }
        
    }
    
    public static LocalDate formatDate(String date) throws DateTimeException{
        LocalDate jDate;
        try{
//   System.out.println(date);
String[] dArray = date.split("-");
//  System.out.println(dArray[2]+ dArray[1]+ dArray[0]);
jDate= LocalDate.of(toInt(dArray[2]), toInt(dArray[1]), toInt(dArray[0]));
//  System.out.println(jDate.toString());
  
        }
        catch(DateTimeException ex){
            //ex.printStackTrace();
           System.out.println(" ----------- Exception ------------- " +ex.getMessage()  );
           throw new DateTimeException(ex.getMessage());
        }
        return jDate;
    }

    public static boolean patternCheck(String val){
        String pattern = "[0-9]{2}+[-]+[(0-9)]{2}+[-]+[(0-9)]{4}";
      Pattern pat=  Pattern.compile(pattern);
      Matcher matcher= pat.matcher(val);
      boolean doesmatch = matcher.matches();
      return doesmatch;
    }

    public static int toInt(String val){
        int valInt = 0;
        valInt = Integer.parseInt(val);
        return valInt;
    }

	public static void getDate(LocalDate jdate) {
		
        LocalDate today = LocalDate.now();
        System.out.println("Current date : "+ today  +" Joining Date : "+jdate);
     Period period= jdate.until(today);
     int days = period.getDays();
     int months=period.getMonths();
     int years = period.getYears();
     if (years==0)    System.out.println("Today Experience : "+months+" Month/Months and "+days+" Day/Days");
     else System.out.println("Today Experience : "+years+" Year/Years, "+months+" Month/Months and "+days+" Day/Days");
            
        }
        
         
	
}