package design_pattern;
/*2020.04.08 written by sy*/

import java.util.Scanner;

public class Player {
	private String name;
	private String userWord;

	public String getName() {
		return name;
	}

	public Player(String name) { // Plyaer 생성자
		this.name = name;
	}

	public void getWordFromUser() {
		System.out.print(name + ">>");
		Scanner sc = new Scanner(System.in);
		userWord = sc.next();
	}

	public boolean checkSuccess(String beforeWord) {
		int lastIndex = beforeWord.length() - 1;
		char lastChar = beforeWord.charAt(lastIndex);
		char firstChar = userWord.charAt(0);
		if (firstChar == lastChar)
			return true;
		else
			return false;
	}

	public String getUserWord() {
		return userWord;
	}
}
