
package ninesquares;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;



public class NineSquares {
    public JFrame jFrame;
    
    /* Define an array of special purpose panel responsive to mouse moves */
    private final MyJPanel panels[];
    
    /* The number of cells int he 3x3 panel is 9 */
    private final static int NUMBER_PANELS = 9;
    
    /* Define an array of colors one for each of the panel objects */
    public Color colors[] = {Color.blue, Color.green, Color.red, Color.white,
                             Color.yellow, Color.black, Color.orange, Color.cyan,
                             Color.gray
                            };
    
    public NineSquares() {
        panels = new MyJPanel[NUMBER_PANELS];
        jFrame = new JFrame("NINE SQUARES PROGRAM");
        
        /* Set size of JFrame panel to 500 px wide by 500 px height */
        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /* Define the layout manager for JFrame to be GridLayout */
        jFrame.getContentPane().setLayout( new GridLayout(3,3));
        
        /*Add each MyJPanel object to the parallel array */
        
        for (int i = 0; i < NUMBER_PANELS; i++) {
           panels[i] = new MyJPanel(colors[i]);
           jFrame.getContentPane().add(panels[i]);
        }
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        NineSquares ninesquares = new NineSquares();
    }
    
}
