/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clock;

/**
 * This is a simplistic Alarm Object Class, which takes in data from the model / view 
 * which will then be added to the priority queue. 
 * 
 * This class will return the values set by the alarm, as well as a string representation
 * of the time set within the alarm.
 * @author Alanna Zimbehl - 19016467
 */

public class Alarm {
 /** 
 * @param hour contains the hour value of the alarm set
 * @param minute contains the minute value of the alarm set
 * @param second contains the seconds value of the alarm set
 */
    
  /**
   * holds the hour data from the main GUI which is passed into the model to be stored into the priority queue
   */
    
    private int hour = 0;
    
  /**
   * holds the minute data from the main GUI which is passed into the model to be stored into the priority queue
   */
    private int minute = 0;
    
  /**
   * holds the second data from the main GUI which is passed into the model to be stored into the priority queue
   */
    private int second =0;
    
    
   /**
   * initialises the objects default values to the arguments passed in through the constructors method for hours, minutes and seconds
   */
    public Alarm(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
   /**
   * initialises the objects default values to zero for hours, minutes and seconds
   */
    
    public Alarm() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    
 /**
 * gets the objects hour current value
 */
    public int getHour() {
        return hour;
    }
    
/**
 * sets the objects hour current value
 */
    public void setHour(int hour) {
        this.hour = hour;
    }
    
/**
 * gets the objects minute current value
 */
    public int getMinute() {
        return minute;
    }

    /**
 * sets the objects minute current value
 */
    public void setMinute(int minute) {
        this.minute = minute;
    }

    /**
 * gets the objects second current value
 */
    public int getSecond() {
        return second;
    }

    /**
 * sets the objects second current value
 */
    public void setSecond(int second) {
        this.second = second;
    }
    
    
 /**
 * increments the hours current value, if the value goes over 23 it returns 0, like a loop.
 */
    
    public void incrementHour(){
        if(this.hour >=0 && this.hour <23){
            this.hour++;  
        }else{
            this.hour = 0;
        }     
    }
    
 /**
 * increments the minute current value, if the value goes over 59 it returns 0, like a loop.
 */
    public void incrementMinute(){
        if(this.minute >=0 && this.minute <59){
            this.minute++;  
        }else{
            this.minute = 0;
        } 
    }
    
/**
 * increments the second current value, if the value goes over 59 it returns 0, like a loop.
 */     
    public void incrementSecond(){
       if(this.second >=0 && this.second <59){
            this.second++;  
        }else{
            this.second = 0;
        }        
    }
    
/**
 * decreases the hours current value, if the value under 0 it returns 23 like a loop.
 */    
    public void decreaseHour(){
       if(this.hour >1 && this.hour <=23){
            this.hour--;  
        }else{
            this.hour = 23;
        }           
    }
    
    
/**
 * increments the minute current value, if the value goes under 0 it returns 59 like a loop.
 */ 
    
    public void decreaseMinute(){
        if(this.minute >1 && this.minute <=59){
            this.minute--;  
        }else{
            this.minute = 59;
        }          
    }
    
/**
 * decreases the second current value, if the value under 0 it returns 59 like a loop.
 */     
    public void decreaseSecond(){
        if(this.second >1 && this.second<=59){
            this.second--;  
        }else{
            this.second = 59;
        } 
    }

/**
 * 
 * @return string message with the current held time
 */    
    public String getTime(){
        String str="";
        str += getHour() + " " +getMinute()+ " " +getSecond();
        return str;
    }
 
/**
 * 
 * @return the getTime method and overrides the toString method, in a string representation
 */
    @Override
    public String toString(){
        return getTime();
    }
}
