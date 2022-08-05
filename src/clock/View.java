package clock;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Observer;
import java.util.Observable;

public class View implements Observer {
    
    ClockPanel panel;
    AlarmPanel alarmClock;
    JButton aboutButton;
    JButton setAlarms;
    JButton viewAlarms;
    JButton editAlarms;
    JMenu menu;
    
    JMenuItem aboutItem;
    JMenuItem viewAlarm;
    JMenuItem setAlarm;
    JMenuItem editAlarm;
    
    JRadioButtonMenuItem analogButton;
    JRadioButtonMenuItem digitalButton;
    
    public View(Model model) {
        
        final JFrame frame = new JFrame();
        panel = new ClockPanel(model);
        alarmClock = new AlarmPanel(model);
        
//      frame.setContentPane(panel);

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
        aboutItem.setMnemonic('A');
        aboutItem.addActionListener(new AboutButtonHandler());
        menu.add(aboutItem);
        menuBar.add(menu);
        
        
//      Clock Radio Buttons
        JRadioButtonMenuItem analogButton = new JRadioButtonMenuItem("Analog Face", true);
        JRadioButtonMenuItem digitalButton = new JRadioButtonMenuItem("Digital Face", false);
        ButtonGroup group = new ButtonGroup();
        group.add(analogButton);
        group.add(digitalButton);
        menu.add(analogButton);
        menu.add(digitalButton);
        
        
        
//      Toggling the analog and digital forms of the clock
        digitalButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            alarmClock.setVisible(true);
            panel.setVisible(false);
        }   
    });
        
        analogButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            alarmClock.setVisible(false);
            panel.setVisible(true);
        }   
    });
        
        
//      Alarm Menu Items
        viewAlarm = new JMenuItem("View Alarms");
        aboutItem.setMnemonic('V');
        setAlarm = new JMenuItem("Set Alarms");
        aboutItem.setMnemonic('S');
        editAlarm = new JMenuItem("Edit Alarms");
        aboutItem.setMnemonic('E');
        alarm.add(viewAlarm);
        alarm.add(setAlarm);
        alarm.add(editAlarm);
        menuBar.add(alarm);
       
        
//      centered clock       
        panel.setPreferredSize(new Dimension(300, 200));
        pane.add(panel, BorderLayout.CENTER);
        
//      main clock UI
        setAlarms = new JButton("Set Alarm");
        pane.add(setAlarms, BorderLayout.PAGE_END);
        
        viewAlarms = new JButton("View All Alarms");
        pane.add(viewAlarms, BorderLayout.LINE_START);
        
        
        
        editAlarms = new JButton("Edit Alarms");
        pane.add(editAlarms, BorderLayout.LINE_END);
     
        
        // End of borderlayout code
        
        //      Setting the menubar
        frame.setJMenuBar(menuBar);
        
        frame.pack();
        frame.setVisible(true);
    }
    
    public void update(Observable o, Object arg) {
        panel.repaint();
        alarmClock.repaint();
    }
}
