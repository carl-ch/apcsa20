package comps;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;

import dinoFinal.Resource;

public class Obstacles {
	private class Obstacle {
		BufferedImage image;
		int x;
		int y;

		Rectangle getObstacle() {
			Rectangle obstacle = new Rectangle();
			obstacle.x = x;
			obstacle.y = y;
			obstacle.width = image.getWidth();
			obstacle.height = image.getHeight();

			return obstacle;
		}
	}

	private int firstX;
	private int obstacleInterval;
	private int movementSpeed;

	private ArrayList<BufferedImage> buffImageList;
	private ArrayList<Obstacle> obList;

	private Obstacle blockedAt;

	public Obstacles(int firstPos) {
		obList = new ArrayList<Obstacle>();
		buffImageList = new ArrayList<BufferedImage>();

		firstX = firstPos;
		obstacleInterval = 220;
		movementSpeed = 11;

		//	buffImageList.add(new Resource().getResourceImage("../img/Wall-1.png"));
		buffImageList.add(new Resource().getResourceImage("../img/Wall-2.png"));
		//	buffImageList.add(new Resource().getResourceImage("../img/Wall-3.png"));
		//	buffImageList.add(new Resource().getResourceImage("../img/Wall-4.png"));
		buffImageList.add(new Resource().getResourceImage("../img/Wall-5.png"));
		buffImageList.add(new Resource().getResourceImage("../img/Wall-6.png"));
		buffImageList.add(new Resource().getResourceImage("../img/Wall-7.png"));
		//  buffImageList.add(new Resource().getResourceImage("../img/Cactus-2.png"));
		//  buffImageList.add(new Resource().getResourceImage("../img/Cactus-1.png"));
		//  buffImageList.add(new Resource().getResourceImage("../img/Cactus-3.png"));
		//  buffImageList.add(new Resource().getResourceImage("../img/Cactus-4.png"));
		//  buffImageList.add(new Resource().getResourceImage("../img/Cactus-5.png"));

		int x = firstX;

		for (BufferedImage img : buffImageList) {

			Obstacle ob = new Obstacle();

			ob.image = img;
			ob.x = x;
			ob.y = Ground.GROUND_Y - img.getHeight() + 4;
			x += obstacleInterval;

			obList.add(ob);
		}
	}

	public void update() {
		Iterator<Obstacle> looper = obList.iterator();

		Obstacle firstOb = looper.next();
		firstOb.x -= movementSpeed;

		while (looper.hasNext()) {
			Obstacle ob = looper.next();
			ob.x -= movementSpeed;
		}

		Obstacle lastOb = obList.get(obList.size() - 1);

		if (firstOb.x < -firstOb.image.getWidth()) {
			obList.remove(firstOb);
			firstOb.x = obList.get(obList.size() - 1).x + obstacleInterval;
			obList.add(firstOb);
		}
	}

	public void create(Graphics win) {
		for (Obstacle ob : obList) {
			win.setColor(Color.black);
			//  g.drawRect(ob.getObstacle().x, ob.getObstacle().y, ob.getObstacle().width,
			//  ob.getObstacle().height);
			win.drawImage(ob.image, ob.x, ob.y, null);
		}
	}

	public boolean hasCollided() {
		for (Obstacle ob : obList) {
			if (Dino.getDino().intersects(ob.getObstacle())) {
				System.out.println("Dino = " + Dino.getDino() + "\nObstacle = " + ob.getObstacle() + "\n\n");
				blockedAt = ob;
				return true;
			}
		}
		return false;
	}

	public void resume() {
		//  this.obList = null;
		int x = firstX / 2;
		obList = new ArrayList<Obstacle>();

		for (BufferedImage im : buffImageList) {

			Obstacle ob = new Obstacle();

			ob.image = im;
			ob.x = x;
			ob.y = Ground.GROUND_Y - im.getHeight() + 5;
			x += obstacleInterval;

			obList.add(ob);
		}
	}

}