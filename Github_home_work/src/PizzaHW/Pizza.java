package PizzaHW;

public class Pizza {
	private int diameter, // קוטר של הפיצה
			slices, // מספר משולשים
			toppings; // מספר תוספות

	public Pizza(int diameter, int slices, int toppings) {

		if (!setDiameter(diameter)) {
			throw new IllegalArgumentException
						("Diameter not at range >= 10 and <= 50 ==> " + diameter);
		} else if (!setSlices(slices)) {
			throw new IllegalArgumentException
						("Number of slices not at range >= 1 and <= 8 ==> " + slices);
		} else if (!setToppings(toppings)) {
			throw new IllegalArgumentException
						("Number of extras not at range >= 0 and <= 5 ==> " + toppings);
		}
	}

	public int getDiameter() {
		return diameter;
	}

	public boolean setDiameter(int diameter) {
		if (diameter >= 10 && diameter <= 50) {
			this.diameter = diameter;
			return true;
		} else
			return false;
		// System.out.println("Diameter not at range >= 10 and <= 50 ==> " + diameter);
	}

	public int getSlices() {
		return slices;
	}

	public boolean setSlices(int slices) {
		if (slices >= 1 && slices <= 8) {
			this.slices = slices;
			return true; 
		} else
			return false;
			// System.out.println("Number of slices not at range >= 1 and <= 8 ==> " + slices);

	}

	public int getToppings() {
		return toppings;
	}

	public boolean setToppings(int toppings) {
		if (toppings >= 0 && toppings <= 5) {
			this.toppings = toppings;
			return true;
		} else
			return false;
			// System.out.println("Number of toppings not at range >= 0 and <= 5 ==> " + toppings);
	}

	public boolean isBasicPizza() {
		return (toppings == 0 ? true : false);

	}

	public void print() {
		System.out.println("Diameter    ==> " + getDiameter() + '\n' + "Slices      ==> " + getSlices() + '\n'
				+ "Extras    ==> " + getToppings() + '\n' + "*********************************************");
	}

}
