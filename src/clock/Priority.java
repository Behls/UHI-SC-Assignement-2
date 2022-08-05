package clock;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alanna Zimbehl - 19016467
 */
public class Priority {
    
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
