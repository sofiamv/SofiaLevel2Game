import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer t;
	GameObject go;
	final int m = 0;
	final int i = 1;
	final int g = 2;
	final int e = 3;
	int c = m;
	Font gah = new Font("Comic Sans MS", Font.ROMAN_BASELINE, 55);
	Font gaah = new Font("Comic Sans MS", Font.ROMAN_BASELINE, 30);
	Font asdfghjkl = new Font("Comic Sans MS", Font.PLAIN, 20);
	public static BufferedImage WomanImg;
	public static BufferedImage CharacterImg;
	public static BufferedImage FlyImg;
	public static BufferedImage RoomImg;
	Character cha = new Character(0, 200, 400, 500);
	ObjectManager oj = new ObjectManager(cha);
	public void um() {

	}

	public void ui() {

	}

	public void ug() {
		cha.update();
		oj.update();
		oj.me();
		oj.cc();
		oj.po();
		if(oj.fc == 300) {
			c = e;
		}
	}

	public void ue() {

	}

	public void dm(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, FlySwatter.WIDTH, FlySwatter.HEIGHT);
		g.setColor(Color.red);
		g.setFont(gah);
		g.drawString("Fly Swatting Game", 300, 200);
		g.drawString("press enter for instructions", 200, 500);
	}

	public void di(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(0, 0, FlySwatter.WIDTH, FlySwatter.HEIGHT);
		g.setColor(Color.white);
		g.setFont(gaah);
		g.drawString("Welcome to the Fly Swatting game", 300, 50);
		g.setFont(asdfghjkl);
		g.drawString("You are in your living room. There is a bowl of open fruit.", 140, 100);
		g.drawString("Now there's a bunch of flies in your house. Kill them :)", 300, 121);
		g.drawString("Press arrow keys to move. Just run into the flies to kill them", 150, 163);
		g.drawString("To win, you must kill 300 flies!", 400, 184);
		g.drawImage(GamePanel.WomanImg, 400, 350, 400, 300, null);
	}

	public void dg(Graphics g) {
		g.drawImage(GamePanel.RoomImg, 0, 0, FlySwatter.WIDTH, FlySwatter.HEIGHT, null);
		cha.draw(g);
		oj.draw(g);
		g.setColor(Color.orange);
		g.setFont(asdfghjkl);
		g.drawString("Dead Flies:" + oj.fc, 900, 30);
	}

	public void de(Graphics g) {
		g.setColor(Color.magenta);
		g.fillRect(0, 0, FlySwatter.WIDTH, FlySwatter.HEIGHT);
		g.setFont(gah);
		g.setColor(Color.YELLOW);
		g.drawString("Congratulations! you have won!", 100, 300);
		g.setFont(gaah);
		g.drawString("press enter to restart", 400, 400);
	}

	GamePanel() {
		try {
			WomanImg = ImageIO.read(this.getClass().getResourceAsStream("woman.jpg"));
			CharacterImg = ImageIO.read(this.getClass().getResourceAsStream("character.png"));
			FlyImg = ImageIO.read(this.getClass().getResourceAsStream("Fly.png"));
			RoomImg = ImageIO.read(this.getClass().getResourceAsStream("room.jpg"));
		} catch (IOException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}
		t = new Timer(1000 / 90, this);
		go = new GameObject(0, 0, 20, 20);
	}

	public void StartGame() {
		t.start();
	}

	@Override
	public void paintComponent(Graphics gg) {
		go.draw(gg);
		if (c == m) {
			dm(gg);
		} else if (c == i) {
			di(gg);
		} else if (c == g) {

			dg(gg);

		} else if (c == e) {
			de(gg);
		}
	}

	@Override
	public void actionPerformed(ActionEvent ee) {
		// TODO Auto-generated method stub
		go.update();
		repaint();
		if (c == m) {

			um();

		} else if (c == i) {
			ui();
		}
		if (c == g) {
			ug();
		} else if (c == e) {
			ue();

		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("1 :(");
	}

	@Override
	public void keyPressed(KeyEvent yee) {
		// TODO Auto-generated method stub
		System.out.println("2 D:");
		if (yee.getKeyCode() == KeyEvent.VK_ENTER) {
			c++;
			if(c == m) {
				cha = new Character(cha.x, cha.y, cha.width, cha.height);
				oj = new ObjectManager(cha);
			}
		}
		if (c > e) {
			c = m;
		}
		if(yee.getKeyCode() == KeyEvent.VK_DOWN) {
			cha.y+=cha.speed;
		}
		if(yee.getKeyCode() == KeyEvent.VK_UP) {
			cha.y-=cha.speed;
		}
		if(yee.getKeyCode() == KeyEvent.VK_RIGHT) {
			cha.x+=cha.speed;
		}
		if(yee.getKeyCode() == KeyEvent.VK_LEFT) {
			cha.x-=cha.speed;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("3 D':");
	}

}
