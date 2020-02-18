// 5.	Write a java class to find the date of next month second Sunday by using java time API.
import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;
import java.time.temporal.ChronoUnit;

class Q5{
    public static void main (String args[]) {
	
		System.out.println("Getting date");
        // WIthout Temporal
        getDate();
        //With Temporal
        getDateTemporal();
	}

	public static void getDate() {
		
        LocalDate today = LocalDate.now();
        Month monthValue =today.getMonth();
         int year = today.getYear(); 
         int month = today.getMonthValue();
         //today.getMonthValue(); 
         DayOfWeek dayoftheWeek = today.getDayOfWeek();
         
         int day = today.getDayOfMonth(); 
         System.out.println("Current date : "+ today  +" Year :"+ year +" Month : "+month+" Month Name :"+monthValue.name() +" day : "+day+" dayoftheWeek:  "+dayoftheWeek.name());
        Month nextMonth = today.getMonth();
        
        
         if(month+1>=12)
        {
            nextMonth = today.getMonth().JANUARY;
            System.out.println(nextMonth.name()+" : "+year++);
        }
        else{
            nextMonth = Month.of(month+1);
            System.out.println(nextMonth.name());
        }
        
        int daysInMonth = YearMonth.of(year, nextMonth).lengthOfMonth();
        System.out.println("Year : "+year+" DaysInMonth : "+daysInMonth);
        int j=0;
        for(int i=1;i<=daysInMonth;i++){
            MonthDay mday = MonthDay.of(nextMonth, i);
            LocalDate dy = LocalDate.of(year,mday.getMonthValue(),i);
            String dayName = dy.getDayOfWeek().name();
            if(dayName=="SUNDAY") j++;
            if(dayName=="SUNDAY"&&j==2){
                System.out.println("Date of Second Sunday of the next month : "+dy.getDayOfMonth()+" : "+dy.toString()+" : "+dy.getDayOfWeek());
            }
           
            
        }
        
         
         
    }
    
    public static void getDateTemporal() {
		
        LocalDate today = LocalDate.now();
        LocalDate plusToday = today.plus(1,ChronoUnit.MONTHS);
        LocalDate plusTodayFirst = plusToday.of(plusToday.getYear(),plusToday.getMonth(),1);

        LocalDate plusTodayFirstSunday=  plusTodayFirst.with(TemporalAdjusters.next(DayOfWeek.SUNDAY))     ;  
        LocalDate plusTodaySecondSunday=  plusTodayFirstSunday.with(TemporalAdjusters.next(DayOfWeek.SUNDAY))     ; 
        System.out.println("Second Sunday of Next Month : "+plusTodaySecondSunday.toString());
         
         
	}
	
}