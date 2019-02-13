package com.pkg.assignment1;

/**
 * An efficient algorithm to calculate modular of numbers with astronomical Powers
 * 
 * @author Jaimin Parekh
 *
 */
public class ModularExponent {

	static int exp = 1000;
	static int x = 100;
	static int m = 31;

	public static void main(String[] args) {

		ModularExponent bpe = new ModularExponent();
		System.out.println(bpe.modExp(x, exp, m));
	}

	public int modExp(int num, int exp, int mod) {
		int temp = 1;
		String inBinary = Integer.toBinaryString(exp);

		for (int i = 1; i <= inBinary.length(); i++) {
			if (inBinary.charAt(inBinary.length() - i) == '1') {
				temp = (temp * num) % mod;
			}
			num = (num * num) % mod;
		}
		return temp;
	}
}