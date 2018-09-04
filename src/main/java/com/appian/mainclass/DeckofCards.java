package com.appian.mainclass;

import java.util.LinkedList;
import java.util.List;

import com.appian.beans.Cards;
import com.appian.enums.CardSuits;
import com.appian.enums.CardValues;

public class DeckofCards {

	private List<Cards> cardsList=null;

	public DeckofCards() {

		cardsList = new LinkedList<Cards>();

		for (CardSuits suit : CardSuits.values()) {
			for (CardValues values : CardValues.values()) {
				cardsList.add(new Cards(suit, values));
			}
		}

	}

	public static void main(String args[]) {
		DeckofCards cardsDeck = new DeckofCards();

		if (cardsDeck.checkCardsNotNullAndEmpty(cardsDeck.cardsList)) {
			throw new IllegalArgumentException ("List cannot be empty or null");
			
		}
		cardsDeck.shuffle(cardsDeck.cardsList);
		for (int i = 0; i <= cardsDeck.cardsList.size(); i++) {

			Cards card = cardsDeck.dealOneCard(cardsDeck.cardsList, i);

			if (card != null) {
				System.out.println(i + " " + card.getCardSuits() + "-" + card.getCardValues());
			} else {
				System.out.println(card);
			}
		}
	}

	public Cards dealOneCard(List<Cards> cardsList, int i) {
		// TODO Auto-generated method stub
		if (i == cardsList.size()) {
			return null;
		}
		return cardsList.get(i);
	}

	public void shuffle(List<Cards> cardsList) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < cardsList.size(); i++) {
			int randomCard = (int) ((Math.random() * cardsList.size()));
			Cards temp = cardsList.get(i);
			cardsList.set(i, cardsList.get(randomCard));
			cardsList.set(randomCard, temp);
		}
		
	}

	public boolean checkCardsNotNullAndEmpty(List<Cards> cardsList) {
		if (cardsList == null || cardsList.isEmpty()) {
			return true;
		}
		return false;
	}
	// TODO
}
