package PizzaHW;

import java.util.Scanner;

public class MainPizza {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pizzaQuantity = 0, toppingsQuantity = 0;
		System.out.println("How many Pizza's ? ");
		pizzaQuantity = input.nextInt();

		Pizza[] pizza = new Pizza[pizzaQuantity];
		
		pizza = Initialization(pizzaQuantity);

		for (int pizzaNumber = 0; pizzaNumber < pizzaQuantity; pizzaNumber++) {

			System.out.println("Pizza number " + (pizzaNumber + 1));
			System.out.println(pizza[pizzaNumber].isBasicPizza() ? "Basic Pizza" : "Composed Pizza");
			pizza[pizzaNumber].print();
			toppingsQuantity += pizza[pizzaNumber].getToppings();
		}

		System.out.println("Summary extras ==> " + toppingsQuantity);

	}

	static Pizza[] Initialization(int pizzaQuantity) {

		Pizza[] pizza = new Pizza[pizzaQuantity];

		for (int pizzaNumber = 0; pizzaNumber < pizzaQuantity; pizzaNumber++) {
			try {
				System.out.println("try number ==> " + pizzaNumber);
				pizza[pizzaNumber] = new Pizza((int) (Math.random() * 50 + 10),
											   (int) (Math.random() * 10 + 1),
											   (int) (Math.random() * 7));
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
				pizzaNumber--;
			}
		}
		return pizza ; 

	}

}
