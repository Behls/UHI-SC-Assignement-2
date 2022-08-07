/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clock;

/**
 * Digital Class
 * This class is a component which renders the alarm clock in a digital form 
 * otherwise known as a digital face
 */

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.font.*;
import javax.swing.*;

/**
 *
 * @author Alanna Zimbehl - 19016467
 */

public class DigitalPanel extends JPanel {
    Model model;
    int hour = 0;
    int minute = 0;
    int second = 0;
    
    Font fontChoice=new Font("Calibri",Font.BOLD,20);
    Color fontColor=new Color(19,65,134);
    FontMetrics fm;
    
    
    public DigitalPanel(Model m) {
        
        model = m;
        setPreferredSize(new Dimension(200,00));
        setBackground(Color.white);
        setVisible(false);
    
    }
    
   /**
    * 
    * @param g - graphics type - creating customise paint components to render within a frame/panel
    */
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setFont(fontChoice);
        hour = model.hour;
        minute = model.minute;
        second = model.second;
        
        fm=g.getFontMetrics();
        
        int hourXCoordinate=20;
        int minuteXCoordinate=hourXCoordinate+(fm.getMaxAdvance()*2);
        int secondXCoordinate=hourXCoordinate+(fm.getMaxAdvance()*4);

        //Set color that will use to draw digital number
        g.setColor(fontColor);

        //Draw hour, draw (:) between number, draw minute and draw second.
        g.drawString(Integer.toString(hour),hourXCoordinate,20);
        g.drawString(":",(hourXCoordinate+minuteXCoordinate)/2,20);
        g.drawString(Integer.toString(minute),minuteXCoordinate,20);
        g.drawString(":",(secondXCoordinate+minuteXCoordinate)/2,20);
        g.drawString(Integer.toString(second),secondXCoordinate,20);
        
    }
}
