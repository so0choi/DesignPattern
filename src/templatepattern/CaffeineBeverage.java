package templatepattern;

public abstract class CaffeineBeverage {
	final void makeBeverage() {
		boilWater();
		prepareRecipe();
		pour();
		if (askCustomer())
			addSome();
	}

	public void boilWater() {
		System.out.println("Boiling water");

	}

	public void pour() {
		System.out.println("Pour in cup");
	}

	// 음료 종류에 따라 다르게 수행됨
	public abstract void prepareRecipe();

	public abstract void addSome();

	public boolean askCustomer() {
		return true;
	}

}
