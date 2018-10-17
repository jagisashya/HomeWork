package StringConstructor;

import java.util.Scanner;

public class ProgDelCharFromString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string:");
		String textLine = input.nextLine(), textLineOriginal = textLine;

		System.out.println("Enter a set of characters to delete from a string:");
		String textLineToDelete = input.nextLine();

		int index = 0;

		for (int posDelete = 0; posDelete < textLineToDelete.length(); posDelete++) {
			do {
				index = textLine.indexOf(textLineToDelete.charAt(posDelete));
				if (index != -1) 
					textLine = textLine.substring(0, index) + textLine.substring(index + 1);
				else 
					break;
			} while (index != -1);

		}

		System.out.println("Origina Text: \n" + textLineOriginal + '\n');
		System.out.println("Characters to remove: \n" + textLineToDelete + '\n');
		System.out.println("Result: \n" + textLine + " " + textLine.length());
	}
}
