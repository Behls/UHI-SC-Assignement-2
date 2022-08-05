package clock;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * This is an error handling class that handles empty queues which extends the exception parent class, the constructor calls
 * the parents constructor and handles the error by passing in a string message.
 * @author Alanna Zimbehl - 19016467
 */


public class QueueIsEmptyError extends Exception {

    public QueueIsEmptyError() {
        super("Queue is empty");
    }
    
}
