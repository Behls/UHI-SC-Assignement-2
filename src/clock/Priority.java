package clock;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Simple Priority Class which takes in the data and priority of an alarm from the model
 * @author Alanna Zimbehl - 19016467
 */
public class Priority {
    
    /**
    * @param - data - this holds the hours,minute,seconds data passed from the model
    * @param - priority - this holds the priority value for the queue
    */
    
    private final Alarm data;
    private final int priority;
    
     public Priority(Alarm data, int priority){
         this.data = data;
         this.priority = priority;
    }

    public Alarm getData() {
        return data;
    }

    public int getPriority() {
        return priority;
    }
    
    @Override
    public String toString(){
        String str="";
        str += getData()+ " " +getPriority();
        return str;
    }
   
}
