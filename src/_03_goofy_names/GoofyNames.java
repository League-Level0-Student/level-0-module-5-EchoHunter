package _03_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	static String goofyName;
	static String goof;
	static String uppercase;
	static String Letter;
	static int i = 1;
	static int q = 2;

	public static void main(String[] args) {
		goofyName = JOptionPane.showInputDialog("What is your name?");

		// 1. Ask the user to enter their n
		// 2. Print upper case name to the console using .toUpperCase()
		// Run your program to see that this works.
		uppercase = goofyName.toUpperCase();

		// 3. Loop through each character of the name (steps 4 - 6).
		// HINT: Use .length() to determine the number of characters in the String.

		// 4. Create a String variable to store the next character of the name
		// using .substring(start, end)
		// HINT: replace 'start' and 'end' to get String with character at i
		Letter = uppercase.substring(i, q);
		// 5. Use MODULO to set this variable to upper case for EVEN characters
		// and lower case for ODD characters.

		for (int j = 0; j < goofyName.length(); j++) {

			if (i % 2 == 0) {
				Letter.toUpperCase();

				i++;
				q++;
				Letter = uppercase.substring(i, q);
				goofyName = goofyName + Letter;
				if (q == goofyName.length()) {
					break;
				}

			}

			else {
				goofyName = goofyName + Letter;
				i++;
				q++;
				if (q == goofyName.length()) {
					break;
				}

			}

		}
		// 6. ADD this String (containing 1 char) to the goofyName String

		// 7. Use pop-up to show user their Goofy name
		JOptionPane.showMessageDialog(null, "your goofy name is " + goofyName);
	}
}
