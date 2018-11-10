import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	Character ch;
	long et = 0;
	long eet = 1000;
	int est = 800;
	int timer2 = 60;
	int timer = 1000;
	int fc = 0;
	// int time = 800;
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
			af(new Flies(new Random().nextInt(FlySwatter.WIDTH), 0, 50, 50));
			et = System.currentTimeMillis();
		}
	}
	public void TIME() {
		if (System.currentTimeMillis() - eet >= timer) {
			timer2--;
			eet = System.currentTimeMillis();
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
		for (int i = 0; i < fo.size(); i++) {
			if (fo.get(i).cb.intersects(ch.cb)) {
				fo.get(i).isAlive = false;
				fc++;
			}

		}
	}
}
