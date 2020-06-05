package dinoFinal;

import java.io.*;
import javax.imageio.*;
import javax.swing.*;

import comps.Dino;
import comps.Ground;
import comps.Obstacles;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.math.*;

class GamePanel extends JPanel implements KeyListener, Runnable {

	public static int WIDTH;
	public static int HEIGHT;
	private Thread animator;

	private boolean running = false;
	private boolean gameOver = false;

	private Ground ground;
	private Dino character;
	private Obstacles walls;

	private int score;
	private double subscore;

	public GamePanel() {
		WIDTH = InterfaceRunner.WIDTH;
		HEIGHT = InterfaceRunner.HEIGHT;

		ground = new Ground(HEIGHT);
		character = new Dino();
		walls = new Obstacles((int) (WIDTH * 1.5));

		score = 0;

		setSize(WIDTH, HEIGHT);
		setVisible(true);
	}

	public void paint(Graphics win) {
		//	Introduction.renderSplashFrame(win, 9000);
		super.paint(win);
		win.setColor(Color.white);
		win.fillRect(0, 0, getWidth(), getHeight());
		win.setColor(Color.darkGray);
		win.setFont(new Font("Courier New", Font.BOLD, 20));
		win.drawString(Integer.toString(score), getWidth() - 90, 40);
		ground.create(win);
		character.create(win);
		walls.create(win);
	}

	public void run() {
		running = true;

		while (running) {
			updateGame();
			repaint();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void updateGame() {
		//	score += 1;
		subscore += 0.14;
		score += (int)subscore;

		ground.update();
		//  dino.update();
		walls.update();

		if (walls.hasCollided()) {
			character.die();
			repaint();
			running = false;
			gameOver = true;
			System.out.println("collide");
		}
	}

	public void reset() {
		score = 0;
		System.out.println("reset");
		walls.resume();
		gameOver = false;
	}

	public void keyTyped(KeyEvent e) {
		//  System.out.println(e);
		if (e.getKeyChar() == ' ' || e.getKeyChar() == 'w') {
			if (gameOver)
				reset();
			if (animator == null || !running) {
				System.out.println("Game starts");
				animator = new Thread(this);
				animator.start();
				character.startRunning();
			} else {
				character.jump();
			}
		}
	}

	public void keyPressed(KeyEvent e) {
		//  System.out.println("keyPressed: "+e);
	}

	public void keyReleased(KeyEvent e) {
		//  System.out.println("keyReleased: "+e);
	}
}