package com.appian.beans;

import com.appian.enums.CardSuits;
import com.appian.enums.CardValues;

public class Cards {

	private CardSuits cardSuits;
	public CardValues cardValues;

	public Cards(CardSuits suits, CardValues cardValues) {

		cardSuits = suits;
		this.cardValues = cardValues;
	}

	public CardSuits getCardSuits() {
		return cardSuits;
	}

	public void setCardSuits(CardSuits cardSuits) {
		this.cardSuits = cardSuits;
	}

	public CardValues getCardValues() {
		return cardValues;
	}

	public void setCardValues(CardValues cardValues) {
		this.cardValues = cardValues;
	}

}
