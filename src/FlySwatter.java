import java.awt.Dimension;

import javax.swing.JFrame;

public class FlySwatter {
	JFrame frame;
	final static int WIDTH = 1100;
	final static int HEIGHT = 700;
	GamePanel gp;
FlySwatter(){
	frame = new JFrame();
	gp = new GamePanel();
}
public static void main(String[] args) {
	FlySwatter fs = new FlySwatter();
	fs.setup();
	
}
public void setup() {
	frame.addKeyListener(gp);
	frame.add(gp);
	frame.setVisible(true);
	frame.setSize(WIDTH, HEIGHT);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
	frame.pack();
	gp.StartGame();
}
}
