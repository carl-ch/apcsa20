package comps;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import comps.Ground;
import dinoFinal.Resource;
import javafx.scene.paint.Color;

public class Figure {

	private static int charBaseY, charTopY, charStartX, charEndX;

	static BufferedImage image;

	public Figure() {
		image = new Resource().getResourceImage("../img/Dino-stand.png");

		charBaseY = Ground.GROUND_Y + 5;
		charTopY = Ground.GROUND_Y - image.getHeight() + 5;
		charStartX = 100;
		charEndX = charStartX + image.getWidth();
	}

	public Figure(BufferedImage img, int baseY, int startX) {
		image = img;

		charBaseY = baseY;
		charTopY = baseY - image.getHeight();
		charStartX = startX;
		charEndX = startX + image.getWidth();
	}
	
	public int getBaseY() {
		return charBaseY;
	}
	
	public int getTopY() {
		return charTopY;
	}
	
	public int getStartX() {
		return charStartX;
	}
	
	public int getEndX() {
		return charEndX;
	}
}