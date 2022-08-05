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
    
    private int hour = 0;
    private int minute = 0;
    private int second =0;
    
//  placeholder variables for increasing and decreasing alarm values when set
    private int hourValue;
    private int minuteValue;
    private int secondValue;
    
    public Alarm(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    
    public void incrementHour(){
        int value = this.hourValue;
        if(value >= 0 && value < 24){
            value++;
        }else{
            value = 0;
        }
        hour = value;           
    }
    
    public void incrementMinute(){
        int value = this.minuteValue;
        if(value < 59 && value >= 0){
        value++;
        }else{
            value = 0;
        }  
        
        minute = value;
    }
    
    public void incrementSecond(){
        int value = this.secondValue;
        if(value < 59 && value >= 0){
        value++;
        }else{
            value = 0;
        }  
        
        second = value;         
    }
    
    public void decreaseHour(){
        int value = this.hourValue;
        if(value >= 0 && value < 24){
            value--;
        }else{
            value = 0;
        }
        hour = value;          
    }
    
    public void decreaseMinute(){
        int value = this.minuteValue;
        
        if(value < 59 && value >= 0){
            value--;
            
        }else{
            value = 0;
        }   
        minute = value;         
    }
    
    public void decreaseSecond(){
        int value = this.secondValue;
        
        if(value < 59 && value >= 0){
            value--;
            
        }else{
            value = 0;
        }   
        second = value; 
    }
    
    public String getTime(){
        String str="";
        str += getHour() + " " +getMinute()+ " " +getSecond();
        return str;
    }
    
    @Override
    public String toString(){
        return getTime();
    }
}
