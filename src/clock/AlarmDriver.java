/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clock;

/**
 * This is a simplistic driver class to test the methods within the Alarm Object Class
 * This ensures the methods are working before merging with the main code base later.
 * 
 * This class is designed to initialise various Alarm Objects and will also be sued to 
 * test the priority queue to ensure its functionality before merging into the main code base.
 * 
 * @author Alanna Zimbehl - 19016467
 */

public class AlarmDriver {
   
    public static void main (String[] args){
  
//      new alarm objects
        Alarm alarm1 = new Alarm(10,12,54);
        Alarm alarm2 = new Alarm(15,34,12);
        Alarm alarm3 = new Alarm(13,45,23);
        
//        print out the objects methods
        
        System.out.println(alarm1.getHour());
        System.out.println(alarm2.toString());
        System.out.println(alarm3.getMinute());
  
    }
    
}