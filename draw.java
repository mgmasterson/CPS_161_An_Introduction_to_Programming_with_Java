import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;

/**
 * @author Michael Masterson
 * CPS 161
 * 
 * Simple drawing attempt
 */

public class draw extends JPanel
{
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(new Color(255,237,184));
		g.fillOval(30,30,300,300);
		g.setColor(new Color(255,255,255));
		g.fillOval(60,100,50,50);
		g.fillOval(240,100,50,50);
		g.setColor(new Color(0,0,0));
		g.fillOval(70,120,20,20);
		g.fillOval(250,120,20,20);
		g.drawArc(140,130,80,80,0,-180);
		g.drawArc(50,170,270,100,0,-180);
	}

	public static void main(String[]args)
	{
		JFrame a=new JFrame("Draw face");
		a.getContentPane().add(new draw());
		a.setDefaultCloseOperation
		(JFrame.EXIT_ON_CLOSE);
		a.setSize(400,400);
		a.setLocationRelativeTo(null);
		a.setVisible(true);
	}
}