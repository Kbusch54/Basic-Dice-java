package co.grandcircus;

import java.util.Random;
import java.util.Scanner;

public class Lab6 {
	private static Random randomGenerator;
	public static void main(String[] args) {
		System.out.println("Welcome to Grand Circus Casino!");
		Random randomGenerator = new Random();
		Scanner scan = new Scanner(System.in);
		int userInput;
		String cont = "yes";
		while (cont.equalsIgnoreCase("yes")) {
			System.out.println("Input how many sides you want to dice to have");
			userInput = scan.nextInt();
			for (int counter = 1; counter <= 1; ++counter) {
				int randomInteger = randomGenerator.nextInt(userInput);
				System.out.println(rando(randomInteger));

			}
			for (int counter = 1; counter <= 1; ++counter) {
				int randomInteger = randomGenerator.nextInt(userInput);
				System.out.println(rando(randomInteger));

			}

			System.out.println("Roll Again? (Yes/No");

			cont = scan.next();
		}
		System.out.println("Thanks for playing");

		scan.close();
	}

	public static int rando(int randoMan) {
		int diceRoll = randoMan + 1;
		return diceRoll;
	}
	public static void generateRandomDieRoll () {
		setRandomGenerator(new Random());
	}

	public static Random getRandomGenerator() {
		return randomGenerator;
	}

	public static void setRandomGenerator(Random randomGenerator) {
		Lab6.randomGenerator = randomGenerator;
	}

}
