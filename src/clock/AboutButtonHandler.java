/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clock;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Simple class for handling the actions of a button
 * It opens a dialogue method which displays the message of the modal.
 * @author Alanna Zimbehl  - 1901647
 */
public class AboutButtonHandler implements ActionListener {
    
    public AboutButtonHandler() {
      
    }
    
    @Override
    public void actionPerformed(ActionEvent event){
        openDialogue();
    }
    
         /**
 * @method - opens a dialogue box which contains the about message of the application

 */
    
    private void openDialogue(){
        JFrame frame = new JFrame();
        frame.setTitle("Alarm Clock Assessments");
        JOptionPane.showMessageDialog(frame, "This application was coded by Alanna Zimbehl - 19016467");
    }
}