package clock;

import java.awt.*;
import javax.swing.*;
import java.util.Observer;
import java.util.Observable;

public class View implements Observer {
    
    AlarmPanel panel;
    JButton aboutButton;
    JButton setAlarm;
    JButton digitalFace;
    JButton analogFace;
    JMenu menu;
    
    JMenuItem aboutItem;
    JMenuItem viewAlarms;
    JMenuItem setAlarms;
    
    public View(Model model) {
        
        JFrame frame = new JFrame();
        panel = new AlarmPanel(model);
        //frame.setContentPane(panel);
        frame.setTitle("Java Alarm Clocks ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container pane = frame.getContentPane();
        
//      About Button
        aboutButton = new JButton("About");
        pane.add(aboutButton, BorderLayout.PAGE_START);
        aboutButton.addActionListener(new AboutButtonHandler());
        
//      Menu Bar & Menus
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Clock");
        JMenu alarm = new JMenu("Alarms");
        
//      About menu item        
        aboutItem = new JMenuItem("About");
        aboutItem.addActionListener(new AboutButtonHandler());
        aboutItem.setMnemonic('A');
        menu.add(aboutItem);
        menuBar.add(menu);
        
        
//      Clock Radio Buttons
        JRadioButtonMenuItem analogButton = new JRadioButtonMenuItem("Analog Clock", true);
        JRadioButtonMenuItem digitalButton = new JRadioButtonMenuItem("Digital Clock", false);
        ButtonGroup group = new ButtonGroup();
        group.add(analogButton);
        group.add(digitalButton);
        menu.add(analogButton);
        menu.add(digitalButton);
        
        
//      Alarm Menu Items
        viewAlarms = new JMenuItem("View Alarms");
        setAlarms = new JMenuItem("Set Alarms");
        alarm.add(viewAlarms);
        alarm.add(setAlarms);
        menuBar.add(alarm);
        
 
//      centered clock       
        panel.setPreferredSize(new Dimension(300, 200));
        pane.add(panel, BorderLayout.CENTER);
        
//      main clock UI
        setAlarm = new JButton("Set Alarm");
        pane.add(setAlarm, BorderLayout.PAGE_END);
        
        digitalFace = new JButton("Switch to Digital");
        pane.add(digitalFace, BorderLayout.LINE_START);
        
        analogFace = new JButton("Switch to Analog");
        pane.add(analogFace, BorderLayout.LINE_END);
     
        
        // End of borderlayout code
        
        //      Setting the menubar
        frame.setJMenuBar(menuBar);
        
        frame.pack();
        frame.setVisible(true);
    }
    
    public void update(Observable o, Object arg) {
        panel.repaint();
    }
}
