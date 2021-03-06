package pongProj;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class PongOld extends Canvas implements KeyListener, Runnable {
	private Ball ball;
	private Ball bBall;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private Wall leftWall;
	private Wall rightWall;
	private Wall topWall;
	private Wall bottomWall;

	public PongOld() {
		// set up all variables related to the game
		ball = new Ball(200, 200, 9, 9, Color.blue, 1, 1);
		bBall = new BlinkyBall(300, 300, 10, 10, Color.red, 1, 1);
		leftPaddle = new Paddle(60, 200, 10, 100, Color.black, 3);
		rightPaddle = new Paddle(740, 200, 10, 100, Color.black, 3);
		leftWall = new Wall(0, 0, 0, 1000);
		rightWall = new Wall(800, 0, 0, 1000);
		topWall = new Wall(0, 0, 1000, 0);
		bottomWall = new Wall(0, 550, 1000, 0);

		keys = new boolean[4];

		setBackground(Color.WHITE);
		setVisible(true);

		new Thread(this).start();
		addKeyListener(this); // starts the key thread to log key strokes
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		// set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D) window;

		// take a snap shop of the current screen and same it as an image
		// that is the exact same width and height as the current screen
		if (back == null)
			back = (BufferedImage) (createImage(getWidth(), getHeight()));

		// create a graphics reference to the back ground image
		// we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);

		// see if ball hits left wall or right wall

		if (ball.getX() <= 10) {
			graphToBack.setColor(Color.white);
			ball.draw(graphToBack, Color.white);
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			ball.setPos(300, 300);
			ball.setXSpeed(-2);
			ball.setYSpeed(2);
		}

		if (ball.getX() >= getWidth() - ball.getWidth() - 10) {
			ball.draw(graphToBack, Color.white);
			graphToBack.clearRect(500, 20, 20, 10);
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			ball.setPos(300, 300);
			ball.setXSpeed(2);
			ball.setYSpeed(2);
		}

		// see if the ball hits the top or bottom wall

		if (ball.didCollideBottom(bottomWall) || ball.didCollideTop(topWall)) {
			ball.setYSpeed(-ball.getYSpeed());
		}

		// see if the ball hits the left paddle

		if (ball.didCollideLeft(leftPaddle)) {
			if (ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getXSpeed())) {
				ball.setYSpeed(-ball.getYSpeed());
			} else {
				ball.setXSpeed(-ball.getXSpeed());
			}
		}

		// see if the ball hits the right paddle

		if (ball.didCollideRight(rightPaddle)) {
			if (ball.getX() + ball.getWidth() + ball.getXSpeed() <= rightPaddle.getX()) {
				ball.setYSpeed(-ball.getYSpeed());
			} else {
				ball.setXSpeed(-ball.getXSpeed());
			}
		}

		// see if the paddles need to be moved

		if (keys[0] == true) {
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if (keys[1] == true) {
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		if (keys[2] == true) {
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if (keys[3] == true) {
			rightPaddle.moveDownAndDraw(graphToBack);
		}

		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'W':
			keys[0] = true;
			break;
		case 'Z':
			keys[1] = true;
			break;
		case 'I':
			keys[2] = true;
			break;
		case 'M':
			keys[3] = true;
			break;
		}
	}

	public void keyReleased(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'W':
			keys[0] = false;
			break;
		case 'Z':
			keys[1] = false;
			break;
		case 'I':
			keys[2] = false;
			break;
		case 'M':
			keys[3] = false;
			break;
		}
	}

	public void keyTyped(KeyEvent e) {
	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(8);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}