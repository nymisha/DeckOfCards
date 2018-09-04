package com.appian.test.beans;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.appian.beans.Cards;
import com.appian.enums.CardSuits;
import com.appian.enums.CardValues;

public class TestCards {

	Cards cards;

	@Before
	public void init() {
		cards = new Cards(CardSuits.HEARTS, CardValues.ACE);

	}

	@Test
	public void getCardSuits() {

		CardSuits cardSuits = cards.getCardSuits();
		Assert.assertEquals(cardSuits, cards.getCardSuits());

	}

	@Test
	public void getCardSuitValues() {

		CardValues cardValues = cards.getCardValues();
		Assert.assertEquals(cardValues, cards.cardValues);

	}

}
