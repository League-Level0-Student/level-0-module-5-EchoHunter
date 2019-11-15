package _01_prime_or_not;

import javax.swing.JOptionPane;

public class PriemERnort {
	public static void main(String[] args) {
boolean isPrime = true;
		String numb = JOptionPane.showInputDialog("Give me a number");

		int number = Integer.parseInt(numb);

		for (int i = 2; i < number; i++) {

			if (number % i == 0) {
				JOptionPane.showMessageDialog(null, "This number is not prime");
				isPrime =false;
				break;
			}

						}
		if(isPrime==true) {
			JOptionPane.showMessageDialog(null, "This number is prime");


	}
	}

}
