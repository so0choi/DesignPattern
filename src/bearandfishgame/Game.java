package bearandfishgame;

import java.util.Random;
import java.util.Scanner;

public class Game {
	private Random rand;
	private Bear bear;
	private Fish fish;
	private char[][] map;
	private int count = 0;
	Scanner sc;

	public Game() {
		rand = new Random();
		bear = new Bear(rand.nextInt(20), rand.nextInt(10), 1);
		fish = new Fish(rand.nextInt(20), rand.nextInt(10), 1);
		sc = new Scanner(System.in);
		map = new char[10][20];
	}

	public void mapSetting() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				map[i][j] = '□';
			}
		}
		map[fish.getY()][fish.getX()] = fish.getShape();
		map[bear.getY()][bear.getX()] = bear.getShape();
	}

	public void mapPrinting() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println("");
		}
	}

	public void run() {
		while (!fish.collide(bear)) {
			mapSetting();

			// Bear, Fish의 좌표 출력
			++count;
			System.out.println("Round " + count);
			System.out.print("B:" + bear.getX() + "," + bear.getY());
			System.out.println(" & F:" + fish.getX() + "," + fish.getY());

			mapPrinting();
			System.out.print("Move your bear to catch the fish! Use a/s/d/f >>>");
			char order = sc.next().charAt(0);

			bear.setOrder(order);
			bear.move();
			fish.move();
		}
		end();
	}

	public void end() {
		System.out.println("**Bear catch the Fish!**");

		mapSetting();
		mapPrinting();

		sc.close();
		return;
	}

	public static void main(String[] args) {
		Game game = new Game();
		game.run();
	}

}
