package pongProj;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable {
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block() {

	}

	public Block(int x, int y, int w, int h) {
		xPos = x;
		yPos = y;
		width = w;
		height = h;
	}

	public Block(int x, int y) {
		xPos = x;
		yPos = y;
	}

	// add other Block constructors - x , y , width, height, color

	public Block(int x, int y, int w, int h, Color col) {
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = col;
	}

	// add the other set methods

	public void setColor(Color col) {
		color = col;
	}

	public void draw(Graphics window) {
		// uncomment after you write the set and get methods
		window.setColor(color);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void draw(Graphics window, Color col) {
		window.fillRect(getX(), getY(), getWidth(), getHeight());
		window.setColor(col);
	}

	public boolean equals(Object obj) {
		Block blck = (Block) obj;
		if (blck.getX() == this.getX() && blck.getY() == this.getY() && blck.getWidth() == this.getWidth()
				&& blck.getHeight() == this.getHeight()) {
			return true;
		}
		return false;
	}

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

	public Color getColor() {
		return color;
	}

	// add a toString() method - x , y , width, height, color
	public String toString() {
		return xPos + ", " + yPos + ", " + width + ", " + height + ", " + color;
	}

	@Override
	public void setPos(int x, int y) {
		// TODO Auto-generated method stub
		xPos = x;
		yPos = y;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		xPos = x;
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		yPos = y;
	}
}