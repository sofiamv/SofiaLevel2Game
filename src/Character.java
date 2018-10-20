import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Character extends GameObject{
	int speed = 15;
Character(int x, int y, int width, int height){
	super(x, y, width, height);
}
public void update() {
	super.update();
	cb.setBounds(x+80, y+60, 90, 210);
}
public void draw(Graphics g) {
g.drawImage(GamePanel.CharacterImg, x, y, width, height, null);
}
}
