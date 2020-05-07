package bearandfishgame;

public class Bear extends GameObject {
	private char order;

	public Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	@Override
	public char getShape() { // 객체의 모양을 나타내는 문자 리턴
		return 'B';
	}

	public char getOrder() {
		return order;
	}

	public void setOrder(char order) {
		this.order = order;
	}

	@Override
	public void move() { // 이동한 후의 새로운 위치로 x,y 변경
		char tempOrder = getOrder();
		if (tempOrder == 'a') {
			if (getX() - distance >= 0)
				x -= distance;
			else
				x = 0;
		} else if (tempOrder == 's') {
			if (getY() + distance <= 9)
				y += distance;
			else
				y = 19;
		} else if (tempOrder == 'd') {
			if (getY() - distance >= 0)
				y -= distance;
			else
				y = 0;
		} else if (tempOrder == 'f') {
			if (getX() + distance <= 19)
				x += distance;
			else
				x = 19;
		} else
			System.out.println("Wrong input! Try Again.");
	}

}
