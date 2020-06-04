package comps;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.*;

import javax.imageio.ImageIO;

import dinoFinal.Resource;

public class Ground {

	private class GroundImage {
		BufferedImage image;
		int x;
	}

	public static int GROUND_Y;

	private BufferedImage image;

	private ArrayList<GroundImage> groundImageAll;

	public Ground(int panelHeight) {
		GROUND_Y = (int) (panelHeight - 0.25 * panelHeight);

		try {
			image = new Resource().getResourceImage("../img/Ground.png");
		} catch (Exception e) {
			e.printStackTrace();
		}

		groundImageAll = new ArrayList<GroundImage>();

		for (int i = 0; i < 3; i++) {
			GroundImage o = new GroundImage();
			o.image = image;
			o.x = 0;
			groundImageAll.add(o);
		}
	}

	public void update() {
		Iterator<GroundImage> groundLoop = groundImageAll.iterator();
		GroundImage first = groundLoop.next();

		first.x -= 10;

		int previousX = first.x;
		while (groundLoop.hasNext()) {
			GroundImage next = groundLoop.next();
			next.x = previousX + image.getWidth();
			previousX = next.x;
		}

		if (first.x < -image.getWidth()) {
			groundImageAll.remove(first);
			first.x = previousX + image.getWidth();
			groundImageAll.add(first);
		}

	}

	public void create(Graphics g) {
		for (GroundImage img : groundImageAll) {
			g.drawImage(img.image, (int) img.x, GROUND_Y, null);
		}
	}
}