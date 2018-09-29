import java.awt.Color;
import java.awt.Graphics;

public class Character extends GameObject{
	int speed = 15;
Character(int x, int y, int width, int height){
	super(x, y, width, height);
}
public void update() {
	super.update();
}
public void draw(Graphics g) {
g.drawImage(GamePanel.CharacterImg, x, y, width, height, null);
}
}
