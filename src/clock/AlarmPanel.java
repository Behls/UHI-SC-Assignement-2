/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clock;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * Alarm Panel is a dialogue box that opens where the user it able to set an alarm
 * It implements the Action Listener class as it requires the user to click a button
 * to become visible
 * @author Alanna Zimbehl - 19016467
 */
public class AlarmPanel implements ActionListener {
    
    /**
     * Class variables which are primarily the GUI attributes for building the dialog
     * Model - the model is passed down as data from the alarm will be sent to the model
     * Alarm - brings functionality from the alarm class into the dialog GUI
     */
    Alarm alarm;
    Model model;
    
    JMenuItem aboutItem;
    JMenuItem viewAlarm;
    JMenuItem setAlarm;
    JMenuItem editAlarm;
   
    JDialog dialog;
    JLabel hourLabel;
    JLabel minuteLabel;
    JLabel secondLabel;

    JButton incrementHour;
    JButton incrementMinute;
    JButton incrementSecond;
    
    JButton decreaseHour;
    JButton decreaseMinute;
    JButton decreaseSecond;

    
    public AlarmPanel(Model m){
        model = m;
    }
    
//    
    @Override
    public void actionPerformed(ActionEvent event){
        openDialogue();
    }
    
    public void openDialogue(){
       alarm = new Alarm();
       dialog = new JDialog();
     
//       
       JMenuBar menuBar = new JMenuBar();
       JMenu menu = new JMenu("Clock");
       
//      About menu item        
        aboutItem = new JMenuItem("About");
        aboutItem.setMnemonic('A');
        aboutItem.addActionListener(new AboutButtonHandler());
        menu.add(aboutItem);
        menuBar.add(menu);  
        
//     setting the dialogue sizing properties      
       dialog.getContentPane();
       dialog.setTitle("Set an Alarm");
       dialog.setSize(500,300);
       GridLayout layout = new GridLayout(3,1);
       dialog.setLayout(layout);    
       
//     creating the labels for the alarm       
       hourLabel = new JLabel(""+alarm.getHour(), SwingConstants.CENTER);
       minuteLabel = new JLabel(""+alarm.getMinute(), SwingConstants.CENTER);
       secondLabel = new JLabel(""+alarm.getSecond(), SwingConstants.CENTER);
       dialog.add(hourLabel);
       dialog.add(minuteLabel);
       dialog.add(secondLabel);
       
//     creating and setting the action listeners and the buttons 
       decreaseHour = new JButton("Decrease Hour");
       decreaseHour.addActionListener(new ActionListener(){
           
           @Override         
           public void actionPerformed(ActionEvent event) {
                    alarm.decreaseHour();
                    update();
                }
       });
       
       incrementHour = new JButton("Increase Hour");
       incrementHour.addActionListener(new ActionListener(){
           
           @Override         
           public void actionPerformed(ActionEvent event) {
                    alarm.incrementHour();
                    update();
                }
       });
       
       decreaseMinute = new JButton("Decrease Minute");
       decreaseMinute.addActionListener(new ActionListener(){
           
           @Override         
           public void actionPerformed(ActionEvent event) {
                    alarm.decreaseMinute();
                    update();
                }
       });
       incrementMinute = new JButton("Increase Minute");
       incrementMinute.addActionListener(new ActionListener(){
           
           @Override         
           public void actionPerformed(ActionEvent event) {
                    alarm.incrementMinute();
                    update();
                }
       });
       decreaseSecond = new JButton("Decrease Second");
       decreaseSecond.addActionListener(new ActionListener(){
           
           @Override         
           public void actionPerformed(ActionEvent event) {
                    alarm.decreaseSecond();
                    update();
                }
       });
       
     
       incrementSecond = new JButton("Increase Second");
       incrementSecond.addActionListener(new ActionListener(){
           
           @Override         
           public void actionPerformed(ActionEvent event) {
                    alarm.incrementSecond();
                    update();
                }
       });
                            
       dialog.add(incrementHour);
       dialog.add(incrementMinute);
       dialog.add(incrementSecond);
       
       dialog.add(decreaseHour); 
       dialog.add(decreaseMinute);
       dialog.add(decreaseSecond);
       
//     setting the alarm menu
       JMenu setAlarms = new JMenu("Set Alarm");
       JMenuItem setAlarm = new JMenuItem("Set Alarm");
       setAlarm.setMnemonic('S');
       setAlarms.add(setAlarm);
       menuBar.add(setAlarms);
       
       dialog.setJMenuBar(menuBar);
       dialog.setVisible(true);
       
       
    } 
  
//     update method so the labels repaint
        public void update(){
            
            hourLabel.setText(""+alarm.getHour());
            minuteLabel.setText(""+alarm.getMinute());
            secondLabel.setText(""+alarm.getSecond());
            hourLabel.repaint();
            minuteLabel.repaint();
            secondLabel.repaint();
            
        }
}