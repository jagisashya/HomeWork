package StringConstructor;

import java.util.Scanner;

public class StringDivide {

	public static void main(String[] args) {
		String tatString[];
		Scanner input = new Scanner(System.in);		
		System.out.println("Enter a string:");
		String textLine = input.next();
//		int length = textLine.length();
		int div = 2, kamut = 0;
		for (; div <= textLine.length(); div++) {
			if (textLine.length() % div == 0) {
				kamut = (div <= textLine.length()) ? textLine.length() / div : textLine.length();
				// tatString = new String [kamut];
				break;
			}
		}
		System.out.println("The string was divided into " + kamut + " parts");
		if (kamut != 0) {
			
			tatString = new String[kamut];
			for (int i = 0, startIndex = 0, endIndex = div; i < kamut; i++) {

				tatString[i] = textLine.substring(startIndex, endIndex);
				startIndex += div;
				endIndex += div;
			}
			for (int i = 0; i < kamut; i++) {
				System.out.println(tatString[i]);
			}
		}

	}

}
