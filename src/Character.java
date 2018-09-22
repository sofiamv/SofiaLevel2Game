import java.awt.Color;
import java.awt.Graphics;

public class Character extends GameObject{
	int speed = 5;
Character(int x, int y, int width, int height){
	super(x, y, width, height);
}
public void update() {
	
}
public void draw(Graphics g) {
	   g.setColor(Color.BLUE);
       g.fillRect(x, y, width, height);
}
}
