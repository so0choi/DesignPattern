package bearandfishgame;

import java.util.Random;

public class Fish extends GameObject {
	int count = 0;
	int rNum;
	private Random rand;

	public Fish(int startX, int startY, int distance) {
		super(startX, startY, distance);
		rand = new Random(System.currentTimeMillis());
	}

	@Override
	public char getShape() {
		return 'F';
	}

	@Override
	public void move() {
		while (count > 2) {
			rNum = rand.nextInt(4);
			if (rNum == 0) {
				if (getX() - distance >= 0) {
					x -= distance;
					break;
				}
			} else if (rNum == 1) {
				if (getX() + distance <= 19) {
					x += distance;
					break;
				}
			} else if (rNum == 2) {
				if (getY() - distance >= 0) {
					y -= distance;
					break;
				}
			} else {
				if (getY() + distance <= 9) {
					y += distance;
					break;
				}
			}

		}
		if (++count == 5) // count 초기화
			count = 0;

	}

}
