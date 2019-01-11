package javaBeanClasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class FieldsTests {

	public void emailTest(String email) throws Exception {

		/*
		 * This function is used to verify if the email address is validate conform RFC
		 * 5322. Remark: I allow the use of dangerous security characters such as: ', |
		 * This code are take from site ==>
		 * https://howtodoinjava.com/regex/java-regex-validate-email-address/ I decided
		 * not use API that goes to internet to verify the mail address, in order to be
		 * not dependent on these sites (they are working or not)
		 */

		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

		Pattern pattern = Pattern.compile(regex);

		if (email == null)
			throw new Exception("Email address is imperative");
		Matcher matcher = pattern.matcher(email);
		if (!matcher.matches())
			throw new Exception("Email address is invalid");
	}

	public void blankFieldTest(String str) {
		String testField = str.trim();
		if (str.equals(" ")) {
			System.out.println("O campo e branco");
		} else

			System.out.println((testField.equals("")) ? "depois do Trim" : "Nao e branco");
		System.out.println(testField.length());
	}

	public void testPassword(String psw) throws Exception {
		/*
		 * (?=.*[0-9]) a digit must occur at least once (?=.*[a-z]) a lower case letter
		 * must occur at least once (?=.*[A-Z]) an upper case letter must occur at least
		 * once (?=.*[@#$%^&+=]) a special character must occur at least once (?=\\S+$)
		 * no whitespace allowed in the entire string .{8,} at least 8 characters
		 */
//		String regex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
//		if (psw.matches(regex)) {
//			throw new Exception("Invalid format password: \n" + " - A digit must occur at least once \n"
//					+ " - A lower case letter must occur at least once\r\n"
//					+ " - An upper case letter must occur at least once\r\n"
//					+ " - A special character must occur at least once (@#$%^&+= \r\n"
//					+ " - No whitespace allowed in the entire string\r\n" + " - At least 8 characters");
//		}

		// I prefere another way 

		char psw_chr[] = psw.toCharArray();
		boolean isHaveUperCase = false;
		boolean isHaveNumber = false;
		boolean isHaveLowerCase = false;
		boolean isHaveSpace = false;
		boolean isSpecial = false;
		boolean isLengthProblem = false;

		if (psw.length() < 8)
			isLengthProblem = true;
//			System.out.println("Minimum caracters for the password is 6");
		for (int i = 0; i < psw.length(); i++) {
			if (Character.isDigit(psw.toCharArray()[i]))
				isHaveNumber = true;
			if (Character.isUpperCase(psw.toCharArray()[i]))
				isHaveUperCase = true;
			if (Character.isLowerCase(psw.toCharArray()[i]))
				isHaveLowerCase = true;
			if (psw.toCharArray()[i] == 32)
				isHaveSpace = true;
			if (psw.toCharArray()[i] == '@' || psw.toCharArray()[i] == '#' || psw.toCharArray()[i] == '$'
					|| psw.toCharArray()[i] == '%' || psw.toCharArray()[i] == '^' || psw.toCharArray()[i] == '&'
					|| psw.toCharArray()[i] == '+' || psw.toCharArray()[i] == '=')
				isSpecial = true;
		}

		String strError = "\n";

		if (!isHaveNumber)
			strError = " - A digit must occur at least once \n";
		if (!isHaveLowerCase)
			strError += " - A lower case letter must occur at least once\r\n";
		if (!isHaveUperCase)
			strError += " - An upper case letter must occur at least once\r\n";
		if (!isSpecial)
			strError += " - A special character must occur at least once (@#$%^&+= \r\n";
		if (isHaveSpace)
			strError += " - No whitespace allowed in the entire string\r\n" + " - At least 8 characters";
		if (!isHaveNumber || !isHaveLowerCase || !isHaveUperCase || !isSpecial || isHaveSpace) {
			throw new Exception("Invalid format password: \n" + strError);
		}
	}
}
