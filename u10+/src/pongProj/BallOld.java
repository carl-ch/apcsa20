package pongProj;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class BallOld extends Block implements Collidable {
	private int xSpeed;
	private int ySpeed;

	public BallOld() {
		super(200, 200);
		xSpeed = 3;
		ySpeed = 1;
	}

	// add the other Ball constructors

	public BallOld(int x, int y) {
		super(x, y);
		xSpeed = 3;
		ySpeed = 1;
	}

	public BallOld(int x, int y, int w, int h) {
		super(x, y, w, h);
		xSpeed = 3;
		ySpeed = 1;
	}

	public BallOld(int x, int y, int w, int h, Color col) {
		super(x, y, w, h, col);
		xSpeed = 3;
		ySpeed = 1;
	}

	public BallOld(int x, int y, int w, int h, Color col, int xSpd, int ySpd) {
		super(x, y, w, h, col);
		xSpeed = xSpd;
		ySpeed = ySpd;
	}

	// add the set methods

	public void setXSpeed(int spd) {
		xSpeed = spd;
	}
	
	public void setYSpeed(int spd) {
		ySpeed = spd;
	}
	
	public void moveAndDraw(Graphics window) {
		// draw a white ball at old ball location

		super.draw(window, Color.WHITE);
		setX(getX() + xSpeed);

		// setY

		setY(getY() + ySpeed);

		// draw the ball at its new location

		super.draw(window, super.getColor());
	}

	public boolean equals(Object obj) {
		BallOld bll = (BallOld) obj;
		if (xSpeed == bll.getXSpeed() && ySpeed == bll.getYSpeed())
			return true;
		return false;
	}

	// add the get methods

	public int getXSpeed() {
		return xSpeed;
	}

	public int getYSpeed() {
		return ySpeed;
	}

	// add a toString() method

	public String toString() {
		return super.toString() + ", " + xSpeed + ", " + ySpeed;
	}

	@Override
	public boolean didCollideLeft(Object obj) {
		Block bck = (Block) obj;
		if ((this.getX() <= bck.getX() + bck.getWidth() - this.getXSpeed())
				&& ((this.getY() >= bck.getY() && this.getY() <= bck.getY() + bck.getHeight())
						|| (this.getY() + this.getHeight() >= bck.getY()
								&& this.getY() + this.getHeight() < bck.getY() + bck.getHeight()))) {
			return true;
		}
		return false;
	}

	@Override
	public boolean didCollideRight(Object obj) {
		Block bck = (Block) obj;
		if ((this.getX() + this.getWidth() + this.getXSpeed() >= bck.getX())
				&& ((this.getY() >= bck.getY() && this.getY() <= bck.getY() + bck.getHeight())
						|| (this.getY() + this.getHeight() >= bck.getY()
								&& this.getY() + this.getHeight() < bck.getY() + bck.getHeight()))) {
			return true;
		}
		return false;
	}

	@Override
	public boolean didCollideTop(Object obj) {
		Block bck = (Block) obj;
		if (this.getY() <= bck.getY() + bck.getHeight()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean didCollideBottom(Object obj) {
		Block bck = (Block) obj;
		if (this.getY() + this.getHeight() >= bck.getY()) {
			return true;
		}
		return false;
	}
}