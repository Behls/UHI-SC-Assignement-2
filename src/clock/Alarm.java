/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clock;

/**
 *
 * @author dev
 */
public class Alarm {
    
    private int hour;
    private int minute;
    private int second;
    
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
