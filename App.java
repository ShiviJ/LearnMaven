package com.org.learnMaven;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * patterm matching -- Regular 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       /* String phone ="(866) 825-3227";
        String phonePattern = "\\([0-9]{3}\\) [0-9]{3}\\-[0-9]{4}"; 
        // e.g. (866) 825-3227  
        Pattern pattern = Pattern.compile(phonePattern);  
        Matcher matcher = pattern.matcher(phone); 
        System.out.println("Result===="+ matcher.matches()); */
        
        String officeHourPattern = "(?:Sun|Mon|Tue|Wed|Thu|Fri|Sat) - (?:Sun|Mon|Tue|Wed|Thu|Fri|Sat): (?:([0-9]{1,2}:[0-9]{2} (?:AM|PM) - [0-9]{1,2}:[0-9]{2} (?:AM|PM))|Closed)"; 
        // e.g. Mon - Fri: 7:00 AM - 6:30 PM  // e.g. Sat - Sun: Closed  
        String officeHours= "Mon - Fri: 7:00 AM - 6:30 PM";
        //String officeHoursWeekend = "Sat - Sun: Closed"; 
        Pattern pattern = Pattern.compile(officeHourPattern);  
        Matcher matcher = pattern.matcher(officeHours);  
        System.out.println("Result===="+ matcher.matches()); 
        
    }
}
