package graphicsUnit2;
//(c) A+ Computer Science

//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Shape {
	// instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;
	private int xSpeed;
	private int ySpeed;

	/*
	 * The constructor is used to initialize all instance variables. The constructor
	 * makes the object.
	 */
	public Shape(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {
		setX(x);
		setY(y);
		width = wid;
		height = ht;
		color = col;
		setXSpeed(xSpd);
		setYSpeed(ySpd);
	}

	/*
	 * The draw method draws the shape on the screen.
	 */
	public void draw(Graphics window) {
		window.setColor(color);
		window.fillRect(xPos, yPos, width, height);
		int startAngle = (int) (Math.random() * 180);
		int arcAngle = (int) (Math.random() * 89);
		window.fillArc(xPos+200, yPos+200, width*2, height*2, startAngle, arcAngle);

		// draw whatever you want
		// ^
		// [ :: ]
		// ()

	}

	/*
	 * This draw method will be used to erase the shape.
	 */
	public void draw(Graphics window, Color col) {
		window.setColor(col);
		window.fillRect(xPos, yPos, width, height);
	}

	public void moveAndDraw(Graphics window) {
		window.fillRect(xPos, yPos, width, height);
		xPos += xSpeed;
		yPos += ySpeed;
	}

	// add in set and get methods for xPos, yPos, xSpeed, and ySpeed
	public int getX() {
		return xPos;
	}

	public int getY() {
		return yPos;
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getXSpeed() {
		return xSpeed;
	}

	public int getYSpeed() {
		return ySpeed;
	}

	public void setX(int x) {
		xPos = x;
	}

	public void setY(int y) {
		yPos = y;
	}

	public void setXSpeed(int xSpd) {
		xSpeed = xSpd;
	}

	public void setYSpeed(int ySpd) {
		ySpeed = ySpd;
	}

	public String toString() {
		return xPos + " " + yPos + " " + width + " " + height + " " + color + " " + xSpeed + " " + ySpeed;
	}
}