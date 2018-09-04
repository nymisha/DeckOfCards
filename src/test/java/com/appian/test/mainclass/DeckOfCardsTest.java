package com.appian.test.mainclass;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.appian.beans.Cards;
import com.appian.enums.CardSuits;
import com.appian.enums.CardValues;
import com.appian.mainclass.DeckofCards;


@RunWith(JUnit4.class)
public class DeckOfCardsTest  {
	
	private List<Cards> cardsList;
	private DeckofCards deckOfCards;

	@Before
	public void init()
	{
		deckOfCards= new DeckofCards();
		Cards card1 = new Cards(CardSuits.DIAMONDS,CardValues.ACE);
		Cards card2 = new Cards(CardSuits.HEARTS,CardValues.ACE);
		Cards card3 = new Cards(CardSuits.SPADES,CardValues.JACK);
		Cards card4 = new Cards(CardSuits.CLUBS,CardValues.QUEEN);
		cardsList = new LinkedList<Cards>();
		cardsList.add(card1);
		cardsList.add(card2);
		cardsList.add(card3);
		cardsList.add(card4);	
	}
	
	
	@Test
	public void ShuffleTest() {	
		List<Cards> beforShuffling = new LinkedList<Cards>();
		List<Cards> AfterShuffling = new LinkedList<Cards>();
		for(int i=0; i< cardsList.size(); i++)
		{
			Cards card = cardsList.get(i);
			beforShuffling.add(card);
		}
		deckOfCards.shuffle(cardsList);
		
		for(int i=0; i< cardsList.size(); i++)
		{
			Cards card =cardsList.get(i);
			AfterShuffling.add(card);
		}
		
		Assert.assertNotEquals(AfterShuffling, beforShuffling);	
	}
	
	
	
	
	
	@Test
	public void dealOnecardTest() {	
		
		for(int i=0; i<cardsList.size() ; i++)
		{
			 Cards card = deckOfCards.dealOneCard(cardsList, i);
			 Assert.assertEquals(card , cardsList.get(i));
		}
		
	}
	
	@Test
	public void dealOnecardListIndexSizeEqualTest() {	
		
			 Cards card = deckOfCards.dealOneCard(cardsList, 4);
			 Assert.assertNull(card);
		}
		
	@Test
	public void checkCardsListNonEmptyNotNull() {	
		
		
			Assert.assertFalse(deckOfCards.checkCardsNotNullAndEmpty(cardsList));
		}

	
@Test
public void checkCardsListEmptyTest() {	
	
		 cardsList=new LinkedList<Cards>();
		Assert.assertTrue(deckOfCards.checkCardsNotNullAndEmpty(cardsList));
	}
	

@Test
public void checkCardsListNullTest() {	
	
		 cardsList=null;
		Assert.assertTrue(deckOfCards.checkCardsNotNullAndEmpty(cardsList));
	}
	
}
