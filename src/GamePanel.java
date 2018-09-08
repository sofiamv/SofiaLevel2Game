import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
Timer t;
GameObject go;
GamePanel(){
 t = new Timer(1000/90, this);
 go = new GameObject(0, 0, 20, 20);
}
public void StartGame() {
	t.start();
}
@Override

public void paintComponent(Graphics g){
               go.draw(g);

        }


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	go.update();
	repaint();
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("1 :(");
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("2 D:");
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("3 D':");
}

}
