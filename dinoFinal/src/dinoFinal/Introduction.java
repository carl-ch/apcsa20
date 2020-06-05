package dinoFinal;

import javax.imageio.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JWindow;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class Introduction extends Frame implements ActionListener {
	
    static void renderSplashFrame(Graphics2D g, int frame) {
        final String[] comp = {"foo", "bar", "baz"};
        g.fillRect(120,140,200,40);
        g.setPaintMode();
        g.setColor(Color.BLACK);
        g.drawString("Loading "+comp[(frame/5)%3]+"...", 120, 150);
    }
    
    public Introduction() {
    	JWindow window = new JWindow();
    	window.setLayout(null);
		window.setBounds(200, 150, 400, 300);
		JLabel lab = new JLabel("T-Rex Shmoovement: w or space to jump");
		JLabel lab2 = new JLabel("Carl Cheng");
		lab.setBounds(90, 40, 250, 30);
		lab2.setBounds(175, 90, 150, 30);
		window.add(lab);
		window.add(lab2);
		window.setVisible(true);
		
		try {
		    Thread.sleep(4000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		window.setVisible(false);
		window.dispose();
    	
//        super("SplashScreen demo");
//        setSize(300, 200);
//        setLayout(new BorderLayout());
//        Menu m1 = new Menu("File");
//        MenuItem mi1 = new MenuItem("Exit");
//        m1.add(mi1);
//        mi1.addActionListener(this);
//        this.addWindowListener(closeWindow);
//
//        MenuBar mb = new MenuBar();
//        setMenuBar(mb);
//        mb.add(m1);
//        final SplashScreen splash = SplashScreen.getSplashScreen();
//        if (splash == null) {
//            System.out.println("SplashScreen.getSplashScreen() returned null");
//            return;
//        }
//        Graphics2D g = splash.createGraphics();
//        if (g == null) {
//            System.out.println("g is null");
//            return;
//        }
//        for(int i=0; i<100; i++) {
//            renderSplashFrame(g, i);
//            splash.update();
//            try {
//                Thread.sleep(90);
//            }
//            catch(InterruptedException e) {
//            }
//        }
//        splash.close();
//        setVisible(true);
//        toFront();
    }
    public void actionPerformed(ActionEvent ae) {
        System.exit(0);
    }
    
    private static WindowListener closeWindow = new WindowAdapter(){
        public void windowClosing(WindowEvent e){
            e.getWindow().dispose();
        }
    };
}