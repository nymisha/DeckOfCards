package com.appian.enums;



public enum CardValues {
	
	ACE(1),
	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	EIGHT(8),
	NINE(9),
	TEN(10),
	JACK(11),
	KING(12),
	QUEEN(13);
	
private final int cardValue;
	

CardValues(final int value)
{
	this.cardValue= value;		
}


public int getCardValue() {
	return cardValue;
}


}
