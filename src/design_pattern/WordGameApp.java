package design_pattern;
/*2020.04.08 written by sy*/

import java.util.Scanner;

public class WordGameApp {
	Scanner sc = new Scanner(System.in);
	int n;

	public WordGameApp() {
		System.out.println("끝말잇기 게임을 시작합니다...");
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		n = sc.nextInt();
	}

	public void run() {
		Player[] playerList = new Player[n];
		String name;
		boolean sign = true;
		for (int i = 0; i < n; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			name = sc.next();
			playerList[i] = new Player(name);
		}

		String beforeWord = "아버지";
		System.out.println("시작하는 단어는 아버지입니다.");
		while (sign) {
			int i = 0;
			for (; i < n; i++) {
				playerList[i].getWordFromUser();
				if (!playerList[i].checkSuccess(beforeWord)) {
					System.out.println(playerList[i].getName() + "이 졌습니다.");
					sign = false;
					break;
				}
				beforeWord = playerList[i].getUserWord();
			}

		}
	}

	public static void main(String[] args) {
		WordGameApp wga = new WordGameApp();
		wga.run();
	}

}
