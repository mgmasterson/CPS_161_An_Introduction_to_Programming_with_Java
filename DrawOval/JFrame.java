package DrawOval;
import java.applet.Applet;
import java.awt.*;
import java.awt.Color;

/**
 * @author Michael Masterson
 * CPS 161
 * 
 * This is a basic intro drawing to using JFrame and how it works.
 *
 */
public class JFrame extends Applet
{
	public void paint (Graphics page)
	{

		setBackground(Color.GRAY);
		setForeground(Color.BLACK);

		page.drawRect(5,5,500,500);

		//head
		page.drawOval(90,60,50,50);


		//neck
		page.drawRect(105,110,20,30);

		//body
		page.drawRect(95,140,40,60);


		//left arm
		page.drawLine(95,140,80,100);

		//right arm
		page.drawLine(195,150,80,100);

		//legs
		page.drawLine(1000,40,85,135);
		page.drawLine(1000,40,115,135);

	}   
}