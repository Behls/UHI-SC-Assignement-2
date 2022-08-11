/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import org.junit.*;
import clock.*;
import static org.junit.Assert.*;

/**
 *This class builds upon the driver class and making sure the methods are
 * able to pass there tests.
 * 
 * It contains all methods from the Alarm class using the constructor with no parameters, 
 * whereas the the Driver class initialised the Alarm object with arguments.
 * 
 * Contains methods using setters and getter, increments and decreases.
 * 
 * @author Alanna Zimbehl - 19016467
 */
public class AlarmTests {
    
    @Test
    public void AlarmSetHour(){
    
        Alarm alarm = new Alarm();
        alarm.setHour(12);
        assertEquals("These hour values are not equal",alarm.getHour(),12);
        
    }
    
    @Test
    public void AlarmSetMinute(){
    
        Alarm alarm = new Alarm();
        alarm.setMinute(45);
        assertEquals("These minute values are not equal",alarm.getMinute(),45);  
    }
    
    @Test
    public void AlarmSetSeconds(){
    
        Alarm alarm = new Alarm();
        alarm.setSecond(45);
        assertEquals("These second values are not equal",alarm.getSecond(),45);  
    }
    
    
    @Test
    public void AlarmIncrementHours(){
    
        Alarm alarm = new Alarm();
        alarm.setHour(23);
        alarm.incrementHour();
        assertEquals("This hour value does not goes to 23 then resets to 0 ",alarm.getHour(),0);  
    }
    
    @Test
    public void AlarmIncrementMinutes(){
    
        Alarm alarm = new Alarm();
        alarm.incrementMinute();
        assertEquals("These minute values are not equal",alarm.getMinute(),1);  
    }
    
    @Test
    public void AlarmIncrementSeconds(){
    
        Alarm alarm = new Alarm();
        alarm.setSecond(59);
        alarm.incrementSecond();
        assertEquals("This second value does not goes to 59 then resets to 0",alarm.getSecond(),0);  
    }
    
    @Test
    public void AlarmDecreaseHours(){
    
        Alarm alarm = new Alarm();
        alarm.setHour(23);
        alarm.decreaseHour();
        assertEquals("This hour value does not goes below 0 then resets to 23 instead ",alarm.getHour(),22);  
    }
    
    @Test
    public void AlarmDecreaseMinutes(){
    
        Alarm alarm = new Alarm();
        alarm.decreaseMinute();
        assertEquals("These minute values are not equal",alarm.getMinute(),59);  
    }
    
    @Test
    public void AlarmDecreaseSeconds(){
    
        Alarm alarm = new Alarm();
        alarm.setSecond(59);
        alarm.decreaseSecond();
        assertEquals("This second value is not equal",alarm.getSecond(),58);  
    }
    
}