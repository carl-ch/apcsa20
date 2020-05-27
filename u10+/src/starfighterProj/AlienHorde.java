package starfighterProj;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde {
	private List<Alien> aliens;

	public AlienHorde(int size) {
		aliens = new ArrayList<Alien>(size);
	}

	public void add(Alien al) {
		aliens.add(al);
	}

	public void drawEmAll(Graphics window) {
		for (Alien k : aliens) {
			k.draw(window);
		}
	}

	public void moveEmAll() {
		for (Alien k : aliens) {
			if ((int) (Math.random() * 4) <= 1) {
				k.move("DOWN");
				k.move("LEFT");
			} else {
				k.move("DOWN");
				k.move("RIGHT");
			}
		}
	}

	public void removeShip(Ship s) {
		for (Alien k : aliens) {
			if ((k.getY() + k.getHeight() >= s.getY()) && (k.getY() <= s.getY())) {
				if ((k.getX() - (k.getWidth() / 2) <= s.getX() + (s.getWidth() / 2))
						&& (k.getX() + (k.getWidth() / 2) >= s.getX() + (s.getWidth() / 2))) {
					s.setX(-500);
					s.setY(-500);
				}
			}
		}
	}

	public void removeDeadOnes(List<Ammo> shots) {
		for (Alien k : aliens) {
			for (Ammo j : shots) {
				if ((k.getY() + k.getHeight() >= j.getY()) && (k.getY() <= j.getY())) {
					if ((k.getX() - (k.getWidth() / 2) <= j.getX() + (j.getWidth() / 2))
							&& (k.getX() + (k.getWidth() / 2) >= j.getX() + (j.getWidth() / 2))) {
						aliens.remove(k);
						j.setX(-400);
						j.setY(-400);
					}
				}
			}
		}
	}

	public String toString() {
		return "";
	}
}
