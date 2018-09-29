import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
int x;
int y;
int width;
int height;
boolean isAlive = true;
Rectangle cb;
GameObject(int x, int y, int width, int height){
	this.x = x;
	this.y = y;
	this.width = width;
	this.height = height;
	cb = new Rectangle(x, y, width, height);
}
public void update() {
cb.setBounds(x, y, width, height);
}
public void draw(Graphics g) {
	
}
}
