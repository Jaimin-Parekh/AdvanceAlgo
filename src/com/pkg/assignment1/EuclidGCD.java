package com.pkg.assignment1;


/**
 * Euclid GCD to find GCD of 2 numbers in an effecient way
 * 
 * @author Jaimin Parekh
 *
 */
public class EuclidGCD {

	static int y = 20;
	static int x = 99;
	
	public static void main(String[] args) {
		System.out.println(new EuclidGCD().euclidGCD(x, y));
	}

	public int euclidGCD(int a, int b) {
		if (b % a == 0)
			return a;
		else
			return euclidGCD(b % a, a);
	}
	
	/*public int[] extendedGCD(int a, int b) {
		new int[] 
        if(a == 0)
                return new int[] {b, 0, 1};
        else {
                g, y, x = extendedGCD(b % a, a);
                return (g, x - (b / a) * y, y);
        }*/
}
