/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clock;


/**
 * This is a simplistic driver class to test the methods within the Alarm Object Class
 * This ensures the methods are working before merging with the main code base later.
 * 
 * This class is designed to initialise various Alarm Objects and will also be used to 
 * test the priority queue to ensure its functionality before merging into the main code base.
 *
 * @author Alanna Zimbehl - 19016467
 */

public class AlarmTest {
   
    public static void main (String[] args) throws QueueIsFullError, QueueIsEmptyError{
       
        System.out.println("------ Testing a start to end process -----");
        
//      TESTING BOTH CONSTRUCTORS
        Alarm alarm4 = new Alarm(12,14,15);
        Alarm alarm5 = new Alarm();
        
        
//      testing alarm4 methods
//      getters - work
        System.out.println(alarm4.getHour());
        System.out.println(alarm4.getMinute());
        System.out.println(alarm4.getSecond());

//      setters - work
        alarm4.setHour(11);
        alarm4.setMinute(10);
        alarm4.setSecond(9);
        System.out.println(alarm4.getHour());
        System.out.println(alarm4.getMinute());
        System.out.println(alarm4.getSecond());
 
//      testing the hour doesnt pass 23 and resets to 0        
        alarm4.setHour(23);
        alarm4.incrementHour();
        System.out.println(alarm4.getHour());
        
//      testing the minute doesnt pass 59 and resets to 0        
        alarm4.setMinute(59);
        alarm4.incrementMinute();
        System.out.println(alarm4.getMinute());
        
//      testing the second doesnt pass 59 and resets to 0        
        alarm4.setSecond(59);
        alarm4.incrementSecond();
        System.out.println(alarm4.getSecond());
        
//      testing the hour doesnt decrease past 0 and resets to 23        
        alarm4.setHour(0);
        alarm4.decreaseHour();
        System.out.println(alarm4.getHour());
        
//      testing the minute doesnt pass 0 and resets to 59       
        alarm4.setMinute(0);
        alarm4.decreaseMinute();
        System.out.println(alarm4.getMinute());
        
//      testing the second doesnt pass 0 and resets to 59      
        alarm4.setSecond(0);
        alarm4.decreaseSecond();
        System.out.println(alarm4.getSecond());
       
        
//      testing alarm5 methods
//      getters - work
        System.out.println(alarm5.getHour());
        System.out.println(alarm5.getMinute());
        System.out.println(alarm5.getSecond());

//      setters - work
        alarm5.setHour(15);
        alarm5.setMinute(30);
        alarm5.setSecond(49);
        System.out.println(alarm5.getHour());
        System.out.println(alarm5.getMinute());
        System.out.println(alarm5.getSecond());
 
//      testing the hour doesnt pass 23 and resets to 0        
        alarm5.setHour(23);
        alarm5.incrementHour();
        System.out.println(alarm4.getHour());
        
//      testing the minute doesnt pass 59 and resets to 0        
        alarm5.setMinute(59);
        alarm5.incrementMinute();
        System.out.println(alarm5.getMinute());
        
//      testing the second doesnt pass 59 and resets to 0        
        alarm5.setSecond(59);
        alarm5.incrementSecond();
        System.out.println(alarm5.getSecond());
        
//      testing the hour doesnt decrease past 0 and resets to 23        
        alarm5.setHour(0);
        alarm5.decreaseHour();
        System.out.println(alarm5.getHour());
        
//      testing the minute doesnt pass 0 and resets to 59       
        alarm5.setMinute(0);
        alarm5.decreaseMinute();
        System.out.println(alarm5.getMinute());
        
//      testing the second doesnt pass 0 and resets to 59      
        alarm5.setSecond(0);
        alarm5.decreaseSecond();
        System.out.println(alarm5.getSecond());
        
        
    }
    
}
