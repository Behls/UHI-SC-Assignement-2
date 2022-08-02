/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clock;

/**
 * This is an error handling class that handles full queues which extends the exception parent class, the constructor calls
 * the parents constructor and handles the error by passing in a string message.
 * @author Alanna Zimbehl - 19016467
 */
public class QueueIsFullError extends Exception{

    public QueueIsFullError() {
        super("Queue is full");
        
    }
    
    
    
}
