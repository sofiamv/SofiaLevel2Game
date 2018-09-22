import java.awt.Color;
import java.awt.Graphics;

public class Flies extends GameObject{
	int speed = 2;
Flies(int x, int y, int width, int height){
	super(x, y, width, height);
}
public void update() {
	y-=speed;
}
public void draw(Graphics g) {
	g.setColor(Color.GRAY);
	g.fillRect(x, y, width, height);
	
	
}
}
