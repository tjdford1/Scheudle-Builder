package scheduleGUI;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.border.LineBorder;


public class Day extends JPanel {
	
	public Day() {
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setBackground(Color.WHITE);
	}



    @Override
    public void paintComponent(Graphics g)
    {	
   
    	for(int i = 0; i < 300; i += 25)
    		g.drawLine(1, i, 200, i);
    	
    	
    }
}
