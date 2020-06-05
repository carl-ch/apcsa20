package comps;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import comps.Ground;
import dinoFinal.Resource;
import javafx.scene.paint.Color;

public class Dino extends Figure {
	
	private static int charBaseY, charTopY, charStartX, charEndX;
	private static int charTop, charBottom, use120180or360;

	private static boolean useReached;
	private static int canDivideUse = 20;

	public static final int NONE = 1, RUNNING = 2, JUMPING = 3, DEAD = 4;
	private final int LEFT_FOOT = 1, RIGHT_FOOT = 2, AIR = 3;

	private static int casework;
	private int stance;

	static BufferedImage image;
	BufferedImage leftFoot;
	BufferedImage rightFoot;
	BufferedImage charDead;

	public Dino() {
		super();
		
		image = new Resource().getResourceImage("../img/Dino-stand.png");
		leftFoot = new Resource().getResourceImage("../img/Dino-left-up.png");
		rightFoot = new Resource().getResourceImage("../img/Dino-right-up.png");
		charDead = new Resource().getResourceImage("../img/Dino-big-eyes.png");
		
		charBaseY = this.getBaseY();
		charTopY = this.getTopY();
		charStartX = this.getStartX();
		charEndX = this.getEndX();
		
		//	charBaseY = Ground.GROUND_Y + 5;
		//	charTopY = Ground.GROUND_Y - image.getHeight() + 5;
		//	charStartX = 100;
		//	charEndX = charStartX + image.getWidth();
		use120180or360 = charTopY - 180;
		
		casework = 1;
		stance = AIR;
	}

	public void create(Graphics window) {
		charBottom = charTop + image.getHeight();

		// window.drawRect(getDino().x, getDino().y, getDino().width, getDino().height);

		switch (casework) {

		case RUNNING:
			if (stance == AIR) {
				stance = LEFT_FOOT;
				window.drawImage(leftFoot, charStartX, charTopY, null);
			} else if (stance == LEFT_FOOT) {
				stance = RIGHT_FOOT;
				window.drawImage(rightFoot, charStartX, charTopY, null);
			} else {
				stance = LEFT_FOOT;
				window.drawImage(leftFoot, charStartX, charTopY, null);
			}
			break;

		case JUMPING:
			if (charTop > use120180or360 && !useReached) {
				window.drawImage(image, charStartX, charTop -= canDivideUse, null);
				break;
			}
			if (charTop >= use120180or360 && !useReached) {
				useReached = true;
				window.drawImage(image, charStartX, charTop += canDivideUse, null);
				break;
			}
			if (charTop > use120180or360 && useReached) {
				if (charTopY == charTop && useReached) {
					casework = RUNNING;
					useReached = false;
					break;
				}
				window.drawImage(image, charStartX, charTop += canDivideUse, null);
				break;
			}
		case DEAD:
			window.drawImage(charDead, charStartX, charTop, null);
			break;

		case NONE:
			System.out.println("stand");
			window.drawImage(image, charStartX, charTopY, null);
			break;
		}
	}

	public void die() {
		casework = DEAD;
	}

	public static Rectangle getDino() {
		Rectangle dino = new Rectangle();
		dino.x = charStartX;

		if (casework == JUMPING && !useReached)
			dino.y = charTop - canDivideUse;
		else if (casework == JUMPING && useReached)
			dino.y = charTop + canDivideUse;
		else if (casework != JUMPING)
			dino.y = charTop;

		dino.width = image.getWidth();
		dino.height = image.getHeight();

		return dino;
	}

	public void startRunning() {
		charTop = charTopY;
		casework = RUNNING;
	}

	public void jump() {
		charTop = charTopY;
		useReached = false;
		casework = JUMPING;
	}

	private class DinoImages {

	}

}