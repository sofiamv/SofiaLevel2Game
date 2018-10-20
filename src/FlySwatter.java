import java.awt.Dimension;

import javax.swing.JFrame;

public class FlySwatter {
	JFrame frame;
	final static int WIDTH = 1100;
	final static int HEIGHT = 700;
	int seconds;
	GamePanel gp;
FlySwatter(){
	frame = new JFrame();
	gp = new GamePanel();
}
public static void main(String[] args) throws InterruptedException {
	FlySwatter fs = new FlySwatter();
	fs.setup();
	fs.setTime(80);
	fs.start();
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
public void setTime(int seconds) {
	this.seconds = seconds;
}
public void start() throws InterruptedException{
	int i;
	for(i = seconds; i > 0; i--) {
		Thread.sleep(1000);
	}
	if(i == 0) {
		gp.timerout();
	}
}
}
