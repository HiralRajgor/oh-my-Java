package com.hiral.algo;

public class HelloGoodbye {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Please provide exactly two names as command-line arguments.");
			return;
		}

		String name1 = args[0];
		String name2 = args[1];

		// Print the hello message
		System.out.println("Hello " + name1 + " and " + name2 + ".");

		// Print the goodbye message
		System.out.println("Goodbye " + name2 + " and " + name1 + ".");
	}
}
