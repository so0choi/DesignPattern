package design_pattern;

import java.util.Scanner;

public class RandomGame {
	static Scanner sc = new Scanner(System.in);

	public static void withFor(int ans) {
		int num = sc.nextInt();
		for (; num != ans;) {
			if (num > ans)
				System.out.println("Lower");
			else
				System.out.println("Higher");
			num = sc.nextInt();
		}
	}

	public static void withWhile(int ans) {
		int num = sc.nextInt();
		while (num != ans) {
			if (num > ans)
				System.out.println("Lower");
			else
				System.out.println("Higher");
			num = sc.nextInt();
		}
	}

	public static void withDoWhile(int ans) {
		int num;
		do {
			num = sc.nextInt();
			if (num > ans)
				System.out.println("Lower");
			else if (num < ans)
				System.out.println("Higher");
		} while (num != ans);
	}

	public static void gameProcess() {
		System.out.println("OPTION >> 1.for 2.while 3.do-while");
		int select = sc.nextInt();
		int ans = (int) (Math.random() * 100);
		System.out.println("Hidden number is created. Try it! (answer is.." + ans + ")");

		if (select == 1)
			withFor(ans);
		else if (select == 2)
			withWhile(ans);
		else
			withDoWhile(ans);

		System.out.println("Correct!");
	}

	public static int keepGoing() {
		int result = 1;
		while (true) {
			System.out.println("More Game(y/n)>>");
			char keep = sc.next().charAt(0);
			if (keep >= 'A' && keep <= 'Z')
				keep += 32; // 대문자 처리

			if (keep == 'y' || keep == 'n') {
				if (keep == 'n')
					result = -1;
				break;
			} else
				System.out.println("Only 'y' or 'n' are acceptable!");
		}
		return result;
	}

	public static void main(String[] args) {
		int result = 1;
		do {
			gameProcess();
			result = keepGoing();
		} while (result != -1);
		System.out.println("Bye...");
	}
}
