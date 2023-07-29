package LabProgram405;

import java.util.Scanner;

public class WhatOrder {
	/*
	 * Define a generic method called checkOrder() that checks if four items are in
	 * ascending, neither, or descending order. The method should return -1 if the
	 * items are in ascending order, 0 if the items are unordered, and 1 if the
	 * items are in descending order.
	 */
	// TODO: Define a generic method called checkOrder() that
	// takes in four variables of generic type as arguments.
	// The return type of the method is integer

	// Check the order of the input: return -1 for ascending,
	// 0 for neither, 1 for descending

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		// Check order of four strings
		System.out.println("Order: " + checkOrder(scnr.next(), scnr.next(), scnr.next(), scnr.next()));

		// Check order of four doubles
		System.out.println(
				"Order: " + checkOrder(scnr.nextDouble(), scnr.nextDouble(), scnr.nextDouble(), scnr.nextDouble()));
	}

	public static <T extends Comparable<T>> int checkOrder(T item1, T item2, T item3, T item4) {

		if ((item2.compareTo(item1) > 0) && (item3.compareTo(item2) > 0) && (item4.compareTo(item3) > 0))
			return -1;
		else if ((item2.compareTo(item1) < 0) && (item3.compareTo(item2) < 0) && (item4.compareTo(item3) < 0))
			return 1;
		else
			return 0;
	}
}