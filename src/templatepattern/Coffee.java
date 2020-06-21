package templatepattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {

	@Override
	public void prepareRecipe() {
		System.out.println("Brew coffee grinds");
	}

	@Override
	public void addSome() {
		System.out.println("Add sugar and milk");
	}

	@Override
	public boolean askCustomer() {
		String answer = null;
		System.out.println("Would you like to add sugar and milk?");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException ioe) {
			System.err.println("IO error");
		}
		if (answer.toLowerCase().equals("y")) {
			return true;
		} else
			return false;

	}

}
