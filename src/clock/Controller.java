package clock;

import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

public class Controller {
    
    ActionListener listener;
    Timer timer;
    
    Model model;
    View view;
    
    public Controller(Model m, View v) {
        model = m;
        view = v;
        
        listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               model.update();
        }};
        
        timer = new Timer(100, listener);
        timer.start();
    }
}