package com.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateDemo {
	
	LocalDate date = LocalDate.of(2017, 2, 17); 
	
	
	LocalDate sixtyfifth2017 = LocalDate.ofYearDay(2017, 65);
   
    
    
    LocalTime secondsTime = LocalTime.ofSecondOfDay(12345);
    
    LocalDateTime localdatetime=LocalDateTime.of(2014, 02, 20, 12, 00);
    
    boolean find = LocalDate.of(2017,2, 5).isBefore(LocalDate.now());
    

}
