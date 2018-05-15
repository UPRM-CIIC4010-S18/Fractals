import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class FractalComponent extends JComponent {

	@Override
	public void paintComponent(Graphics g) {
		drawCircle(g, 300, 300, 300);
	}

	public void drawCircle(Graphics g, int xCenter, int yCenter, int diameter) {
		Graphics2D g2 = (Graphics2D) g;
		int radius = (int) (diameter / 2);
		int xCorner = xCenter - radius;
		int yCorner = yCenter - radius;
		Ellipse2D.Double firstCircle = new Ellipse2D.Double(xCorner, yCorner, diameter, diameter);
		g2.draw(firstCircle);

		if (diameter >= 5) {
			int leftXCenter = xCenter - radius;
			drawCircle(g, leftXCenter, yCenter, radius);
			int rightXCenter = xCenter + radius;
			drawCircle(g, rightXCenter, yCenter, radius);
			int topYCenter = yCenter - radius;
			drawCircle(g, xCenter, topYCenter, radius);
			int bottomYCenter = yCenter + radius;
			drawCircle(g, xCenter, bottomYCenter, radius);
		}
	}



}
