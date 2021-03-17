
package ninesquares;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;


public class MyJPanel extends JPanel{
    
    /* Define the color of panel background */
    private final Color myColor;
    
    public MyJPanel(Color myColor) {
        this.myColor = myColor;
        setBackground(myColor);
        addMouseListener(new MouseWatcher());
    }
    
    /* set the panel's background Color */
    public void setColor() {
        setBackground(Color.white);
    }
    public void setSelectedColor() {
       setBackground(Color.magenta);
    }
    public void setOriginalColor() {
        setBackground(myColor);
    }
    
    class MouseWatcher extends MouseAdapter {

        @Override
        public void mouseEntered(MouseEvent e) {
            setSelectedColor();
        }
        @Override
        public void mouseExited(MouseEvent e) {
            setOriginalColor();
        }
        @Override
        public void mouseClicked(MouseEvent e) {
            setColor();
        }
        
    }
}
