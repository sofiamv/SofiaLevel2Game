import java.awt.Graphics;

public class ObjectManager {
	Character ch;
ObjectManager(Character charac){
	this.ch = charac;
}
public void update() {
	
}
public void draw(Graphics g){
	ch.draw(g);
}
}
