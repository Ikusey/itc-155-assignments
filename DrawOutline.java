
import java.awt.Color;
import java.awt.Graphics;

public class DrawOutline {

	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(200, 150);
		Graphics g = panel.getGraphics();
		
//		g.setColor(Color.RED);
//		g.fillRect(20, 10, 100, 50);
//		
//		g.setColor(Color.BLACK);
//		g.drawRect(20, 10, 100, 50);

	        panel.setBackground(Color.WHITE);

	        g.setColor(Color.CYAN);            // cyan background
	        g.fillRect(20, 35, 100, 100);

	        g.setColor(Color.WHITE);           // white "bjp" text
	        g.drawString("BJP", 70, 55);

	        g.setColor(new Color(191, 118, 73));
	        for (int i = 0; i < 10; i++) {     // orange "bricks"
	            g.fillRect(20, 35 + 10 * i, 10 + 10 * i, 9);
	        }
	}

}
