package design_pattern;

import java.util.Scanner;

public class RockScissorPaper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a, b;
		while (true) {
			while (true) {
				System.out.print("person-A>>");
				a = sc.next();
				if (a.equals("가위") || a.equals("바위") || a.equals("보"))
					break;
				System.out.println("가위/바위/보 중 하나를 입력하세요.");
			}
			while (true) {
				System.out.print("person-B>>");
				b = sc.next();
				if (b.equals("가위") || b.equals("바위") || b.equals("보"))
					break;
				System.out.println("가위/바위/보 중 하나를 입력하세요.");
			}
			char winner;
			if (a.equals(b)) {
				System.out.println("무승부입니다.");
				continue;
			} else if (a.equals("가위")) {
				if (b.equals("보"))
					winner = 'A';
				else
					winner = 'B';
			} else if (a.equals("바위")) {
				if (b.equals("가위"))
					winner = 'A';
				else
					winner = 'B';
			} else {
				if (b.equals("가위"))
					winner = 'B';
				else
					winner = 'A';
			}

			System.out.println("결과: 승자는 person-" + winner + " 입니다");
			break;
		}
		sc.close();
	}
}
