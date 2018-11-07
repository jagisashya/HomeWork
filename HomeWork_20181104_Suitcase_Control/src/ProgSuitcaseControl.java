import java.util.Random;
import java.util.Scanner;

public class ProgSuitcaseControl {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int schumToPay = 0;
		int removeItem = 0;
		Passenger passenger = new Passenger();
		SuitCase suitCase = new SuitCase();
		String overWeight;
		boolean isWeightNotOk = true;
		Random rand = new Random();
		Product[] product = new Product[20];
		for (int i = 0, j = 5; i < 20; i++, j++)
			product[i] = new Product(rand.nextInt(16) + 1, "peso" + j);

		for (Product list : product)
			System.out.println(list);

		passenger.setFlyPrice(rand.nextInt(901) + 100);
		passenger.setPermitedWeight(rand.nextInt(91) + 10);
		passenger.setPriceOverKilo(rand.nextInt(191) + 10);

		int gvul = rand.nextInt(6) + 5;
		System.out.println(gvul);
		for (int i = 0; i < gvul; i++)
			suitCase.addProducts(product[rand.nextInt(20)]);
		passenger.setSuitCase(suitCase);

		while (isWeightNotOk) {

			overWeight = passenger.overWeight();
			// if (overWeight .equals("0")) {
			if (overWeight == "0") {

				System.out.println(passenger);
				System.out.println("The weight are OK ");
				isWeightNotOk = false;
			} else {
				schumToPay = passenger.toPay();
				System.out.println(overWeight);

				System.out.println("For each over Kg you need to pay ==> " + passenger.getPriceOverKilo() + '\n'
						+ "The maximum to pay is            ==> " + schumToPay + '\n' + "Hou much to pay ?");
				int schum = input.nextInt();
				if (schum < 0)
					System.out.println("Please only positive values");
				if (schum != 0) {
					if (schum <= schumToPay) {
						System.out.println("\nWe return to you "
								+ (schum - schum / passenger.getPriceOverKilo() * passenger.getPriceOverKilo()));
						schumToPay = schum / passenger.getPriceOverKilo() * passenger.getPriceOverKilo();

					} else
						System.out.println("\nWe return to you " + (schum - schumToPay));

					passenger.addWeight(schumToPay);
				} else {
					System.out.println("whitch parit remove?");
					removeItem = input.nextInt();
					if (!suitCase.removeProducts(removeItem))
						System.out.println("Nothing removed");

				}
			}
		}
		// System.out.println(suitCase);
		input.close();
	}

}
