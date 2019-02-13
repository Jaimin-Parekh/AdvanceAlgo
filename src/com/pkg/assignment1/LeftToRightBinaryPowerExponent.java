package com.pkg.assignment1;

/**
 * An efficient algorithm to calculate astronomical Powers, widely used in cryptography
 * 
 * @author Jaimin Parekh
 *
 */
public class LeftToRightBinaryPowerExponent {

	static int exponent = 1000;
	static int x = 100;

	public static void main(String[] args) {
		
		LeftToRightBinaryPowerExponent bpe = new LeftToRightBinaryPowerExponent();
		System.out.println(bpe.binaryPower(x, exponent));
	}

		
	/**
	 * Calculates left-to-right binary exponentiation.
	 * @param num - input number for which exponent o be calculated
	 * @param power - power
	 * @return num ^ power
	 */
	public double binaryPower(int num, int power) {
		double pow = num;
		String inBinary = Integer.toBinaryString(power);

		for (int x=1; x<inBinary.length(); x++) {
			if (inBinary.charAt(x)=='0')
				pow = pow * pow;
			else
				pow = num * pow * pow;
		}
		System.out.println(pow);
		return pow;
	}
}