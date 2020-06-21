package templatepattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeineBeverage {

	@Override
	public void prepareRecipe() {
		System.out.println("Steep tea bag");
	}

	@Override
	public void addSome() {
		System.out.println("Add lemon");
	}

	@Override
	public boolean askCustomer() {
		String answer = null;
		System.out.println("Would you like to add Lemon?");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException ioe) {
			System.err.println("IO 오류");
		}
		if (answer.toLowerCase().equals("y"))
			return true;
		else
			return false;
	}

}
