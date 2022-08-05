/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clock;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.font.*;
import javax.swing.*;

/**
 *
 * @author Alanna Zimbehl - 19016467
 */

public class AlarmPanel extends JPanel {
    Model model;
    int hour = 0;
    int minute = 0;
    int second = 0;
    
    Font myFont=new Font("Tahoma",Font.BOLD+Font.ITALIC,20);
    Color myColor=new Color(255,0,0);
    FontMetrics fm;
    
    
    public AlarmPanel(Model m) {
        
        model = m;
        setPreferredSize(new Dimension(200,00));
        setBackground(Color.white);
        setVisible(true);
    
    }
    

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setFont(myFont);
        hour = model.hour;
        minute = model.minute;
        second = model.second;
        
        fm=g.getFontMetrics();
        
        int hourXCoordinate=20;
        int minuteXCoordinate=hourXCoordinate+(fm.getMaxAdvance()*2);
        int secondXCoordinate=hourXCoordinate+(fm.getMaxAdvance()*4);

        //Set color that will use to draw digital number
        g.setColor(myColor);

        //Draw hour, draw (:) between number, draw minute and draw second.
        g.drawString(Integer.toString(hour),hourXCoordinate,20);
        g.drawString(":",(hourXCoordinate+minuteXCoordinate)/2,20);
        g.drawString(Integer.toString(minute),minuteXCoordinate,20);
        g.drawString(":",(secondXCoordinate+minuteXCoordinate)/2,20);
        g.drawString(Integer.toString(second),secondXCoordinate,20);
        
    }
}
