package DrawOval;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * @author Michael Masterson
 * CPS 161
 * 
 * This is a basic intro drawing to using JFrame and how it works.
 *
 */
public class oval extends JFrame
{

	int x = 20;
	int y = 20;
	int w = 120;
	int h = 120;

	public void paintComponent(Graphics g) {
		Color[] c = { Color.RED, Color.BLUE};
		for(int i = 0; i < 8; ++i){
			g.setColor(c[i]);
			g.fillOval(x, y, w, h);
		}

	}
}