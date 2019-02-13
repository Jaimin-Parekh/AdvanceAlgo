package com.pkg.assignment1;

import java.util.Arrays;

/**
 * The class implements Misra Gries Algorithm to find majority element in an array
 * 
 * @author Jaimin Parekh
 *
 */
public class MajorityElementSearch {

	private int element;
	private int counter;

	private int[] inputElements = { 6, 1, 1, 5, 1, 1, 9, 1, 0 };

	public static void main(String[] args) {
		MajorityElementSearch search = new MajorityElementSearch();

		int majorElement = search.findMajorityElement(search.inputElements);
		if (search.checkMajority(majorElement, search.inputElements))
			System.out.println(majorElement + " is majority element in "
					+ Arrays.stream(search.inputElements).mapToObj(String::valueOf).toArray(String[]::new));

	}

	/**
	 * This method returns an element which is either the majority element or there
	 * is no majority element in the input array
	 * 
	 * @param input array of input integers
	 * @return probable majority element
	 */
	public int findMajorityElement(int[] input) {
		element = input[0];

		for (int i = 1; i < input.length - 1; i++) {
			//Increment the counter till the same element is found
			if (element == input[i])
				counter++;
			//If the counter is 0 & different element is found then consider new element
			else if (counter == 0)
				element = input[i];
			//If the counter is non-zero & different element is found then decrement the count
			else
				counter--;
		}
		System.out.println("Majority Element " + element);
		return element;
	}

	
	/**
	 * This method confirms if the probable majorElement is major element of the array
	 * @param majorElement
	 * @param input array
	 * @return true if the probable majorElement is actually major, false otherwise
	 */
	public boolean checkMajority(int majorElement, int[] input) {
		int count = 0;
		for (int i = 0; i < input.length - 1; i++) {
			if (input[i] == majorElement)
				count++;
		}
		if (count == input.length / 2)
			return true;
		else
			return false;
	}
}