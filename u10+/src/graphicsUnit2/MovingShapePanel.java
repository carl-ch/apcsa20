package graphicsUnit2;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Font; 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovingShapePanel extends JPanel implements Runnable
{
	private Shape sh;

	public MovingShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);

		//refer sh to a new Shape
		sh = new Shape(100,100,20,20,Color.CYAN,90,40);


		new Thread(this).start();
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		int startAngle = (int) (Math.random() * 180);
		int arcAngle = (int) (Math.random() * 89);
		window.fillArc(sh.getX(), sh.getY(), sh.getWidth() * 4, sh.getHeight() * 4, startAngle, arcAngle);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);

		//tell sh to move and draw
		sh.moveAndDraw(window);
		//this code handles the left and right walls

		if(!(sh.getX()>=sh.getWidth() && sh.getX()<=getWidth()-sh.getWidth()))
		{
			sh.setXSpeed(-sh.getXSpeed());
		}

		if(!(sh.getY()>=sh.getHeight() && sh.getY()<=getHeight()-sh.getHeight()))
		{
			sh.setYSpeed(-sh.getYSpeed());
		}
		//add code to handle the top and bottom walls

	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(10);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}