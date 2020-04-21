import java.awt.Color;
import java.awt.Graphics;

public class graphics {

	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(220, 150);
		Graphics g = panel.getGraphics();
		
		panel.setBackground(Color.YELLOW);

		g.setColor(Color.BLUE);
		g.fillOval(50, 25, 40, 40);
		g.fillOval(130, 25, 40, 40);
		
		g.setColor(Color.RED);
		g.fillRect(70, 45, 80, 80);
		
		g.setColor(Color.BLACK);
		g.drawLine(70, 85, 150, 85);
	}

}
