import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	Character ch;
	long et = 0;
	int est = 50;
	int fc = 0;
	ArrayList<Flies> fo = new ArrayList<Flies>();

	ObjectManager(Character charac) {
		this.ch = charac;
	}
	public void sfc(int a) {
		fc = a;
	}

	public void update() {
		for (int i = 0; i < fo.size(); i++) {
			fo.get(i).update();
		}
	}

	public void draw(Graphics g) {
		ch.draw(g);
		for (int i = 0; i < fo.size(); i++) {
			fo.get(i).draw(g);
		}
	}

	public void af(Flies a) {
		fo.add(a);
	}

	public void me() {
		if (System.currentTimeMillis() - et >= est) {
			af(new Flies(new Random().nextInt(501) + 200, 0, 50, 50));

			et = System.currentTimeMillis();
		}
	}

	public void po() {
		for (int i = 0; i < fo.size(); i++) {
			if (fo.get(i).isAlive == false) {
				fo.remove(fo.get(i));
			}
		}
	}

	public void cc() {
		for(int i = 0; i < fo.size(); i++) {
			if(fo.get(i).cb.intersects(ch.cb)) {
				fo.get(i).isAlive = false;
				fc++;
			}

		}
	}
}
