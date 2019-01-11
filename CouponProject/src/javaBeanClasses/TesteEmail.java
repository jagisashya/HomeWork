package javaBeanClasses;

import java.util.Scanner;

public class TesteEmail {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String email= "     "; //"b.di.!!ka.&*@gmail.com";
//		try {
//  			FieldsTests.emailTest(email);
//		}
//		catch(Exception ex) 
//		{
//		System.out.println(ex.getMessage());
//		}
		// FieldsTests.blankFieldTest("");
		Scanner input = new Scanner(System.in);
		String password;
		password = input.nextLine(); // InputMismatchException
		char psw[] = password.toCharArray();
		boolean isHaveUperCase = false;
		boolean isHaveNumber = false;
		boolean isHaveLowerCase = false;
		boolean isHaveSpace = false;
		boolean isSpecial = false;
		String regex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
		System.out.println(password.matches(regex));
		// System.out.println(passwd.matches(pattern));
		if (password.length() < 6)
			System.out.println("Minimum caracters for the password is 6");
		else {
			for (int i = 0; i < psw.length; i++) {
				if (Character.isDigit(psw[i]))
					isHaveNumber = true;
				if (Character.isUpperCase(psw[i]))
					isHaveUperCase = true;
				if (Character.isLowerCase(psw[i]))
					isHaveLowerCase = true;
				if (psw[i] == 32) {
					isHaveSpace = true;
					break;
				}
				if (psw[i] == '@' || psw[i] == '#' || psw[i] == '$' || psw[i] == '%' || psw[i] == '^' || psw[i] == '&'
						|| psw[i] == '+' || psw[i] == '=')
					isSpecial = true;
			}
		}
		System.out.println(psw.length);
		if (!isHaveLowerCase)
			System.out.println("don't have lower case");
		if (!isHaveNumber)
			System.out.println("don't have Number");
		if (isHaveSpace)
			System.out.println("Error space");
		if (!isHaveUperCase)
			System.out.println("don't have uper case");
		if (!isSpecial)
			System.out.println("don't have special character");
		input.close();
	}
}
