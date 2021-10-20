package com.bridgelabz.workshop2;

import java.util.ArrayList;

/**
 * Purpose of prog  - Initialize the size of Deck of cards
 * @name  - Pratik
 * @java version - 11.0
 * @date   -20/10/2021
 */

public class Cards { // Class of program

	public ArrayList<String> cardsDeck = new ArrayList<>(); //use arrey string type

	public void welcome(){ 

		System.out.println("Welcome to the gaming world of Deck of Cards");
	}
	public void deckOfCards(){ //method will be visible from classes in other packages

		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"}; // type of cards
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace"}; //total cards
		int numOfCards = suits.length * ranks.length; // set of tatl cads use
		System.out.println("\nNumber of cards in the deck:" + numOfCards);

		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				cardsDeck.add(ranks[i] + "--->" + suits[j]);
			}
		}
		toDisplay(cardsDeck);
	}
// display ele.
	public static void toDisplay(ArrayList<String> cardsDeck) {
		System.out.println("\nCards in Deck:");
		for (String element : cardsDeck) {
			System.out.println(element);
		}
		System.out.println();
	}
}

