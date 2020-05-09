package winterScene;

import java.awt.Color;
import java.awt.Graphics;

public class Tree extends AbstractShape {

	public Tree(int x, int y, int wid, int ht, Color col) {
		super(x, y, wid, ht, col, 0, 0);
		// TODO Auto-generated constructor stub
	}

	public void draw(Graphics window) {
		window.fill3DRect(super.getXPos(), super.getYPos() - 190, super.getWidth(), super.getHeight(),
				false);
		window.fillRect(super.getXPos() + super.getWidth() / 4, super.getYPos() - 150, super.getWidth() / 2, super.getHeight() * 4);
	}
	
	public void moveAndDraw(Graphics window) {
	}

}