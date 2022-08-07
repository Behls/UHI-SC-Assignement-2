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

public class PriorityTest {
    
    public static void main (String[] args) throws QueueIsFullError, QueueIsEmptyError{
 
        
        PriorityQueue clock = new PriorityQueue(100);

        System.out.println("------ Testing a start to end process -----");
        
//      new alarm objects
        Alarm alarm1 = new Alarm(10,12,54);
        Alarm alarm2 = new Alarm(15,34,12);
        Alarm alarm3 = new Alarm(13,45,23);
        
//      print out the random objects methods
        System.out.println(alarm1.getHour());
        System.out.println(alarm2.toString());
        System.out.println(alarm3.getMinute());
        
//      Testing priority add Methods       
        clock.add(alarm1, 10);
        clock.add(alarm2, 6);
        clock.add(alarm3, 5); 
        
//      Testing priority head Methods        
        System.out.println(clock.head());
        
//      Testing priority print Methods
        System.out.println(clock.toString());
        
//      Testing priority remove Methods
        clock.remove();
        System.out.println(clock.toString());        
    }
}

