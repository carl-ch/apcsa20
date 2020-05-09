package winterScene;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

//extend the AbstractShape class to make a FancySnowFlake class
public class FancySnowFlake extends AbstractShape {

	public FancySnowFlake(int x, int y, int wid, int ht) {
		super(x, y, wid, ht);
		// TODO Auto-generated constructor stub
	}

	public FancySnowFlake(int x, int y, int wid, int ht, Color col) {
		super(x, y, wid, ht, col);
		// TODO Auto-generated constructor stub
	}

	public FancySnowFlake(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {
		super(x, y, wid, ht, col, xSpd, ySpd);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics window) {
		// TODO Auto-generated method stub
		window.drawString("snow", super.getXPos(), super.getYPos());
		window.drawString("flake", super.getXPos(), super.getYPos() + 14);
	}

	@Override
	public void moveAndDraw(Graphics window) {
		// TODO Auto-generated method stub
		draw(window);
		setXPos(super.getXPos() + super.getXSpeed());
		setYPos(super.getYPos() + super.getYSpeed());
	}

}
