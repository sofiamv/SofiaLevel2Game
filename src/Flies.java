import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Flies extends GameObject{
	int speed = 1;
Flies(int x, int y, int width, int height){
	super(x, y, width, height);
}
public void update() {
	super.update();
	y+=speed;
	x+=(new Random().nextInt(21)-10);
}
public void draw(Graphics g) {
g.drawImage(GamePanel.FlyImg, x, y, width, height, null);
	
}
}
