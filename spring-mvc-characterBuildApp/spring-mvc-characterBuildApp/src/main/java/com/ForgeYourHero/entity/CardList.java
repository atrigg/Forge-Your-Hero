package com.ForgeYourHero.entity;

import java.util.ArrayList;
import java.util.List;

public class CardList {
	Knight knight = new Knight();
	Barbarian barbarian = new Barbarian();
	Bard bard = new Bard();
	Cleric cleric = new Cleric();
	Druid druid = new Druid();
	Monk monk = new Monk();
	Paladin paladin = new Paladin();
	Ranger ranger = new Ranger();
	Rogue rogue = new Rogue();
	Sorcerer sorcerer = new Sorcerer();
	Warlock warlock = new Warlock();
	Wizard wizard = new Wizard();
	
	List<CardList> cardDeck = new ArrayList<CardList>();


	public List <CardList> add(CardList knight) {
		cardDeck.add(knight);
		return cardDeck;
	}
	public List <CardList> add1(CardList barbarian) {
		cardDeck.add(barbarian);
		return cardDeck;
	}
	public List <CardList> add2(CardList bard) {
		cardDeck.add(bard);
		return cardDeck;
	}
	public List <CardList> add3(CardList cleric) {
		cardDeck.add(cleric);
		return cardDeck;
	}
	public List <CardList> add4(CardList druid) {
		cardDeck.add(druid);
		return cardDeck;
	}
	public List <CardList> add5(CardList monk) {
		cardDeck.add(monk);
		return cardDeck;
	}
	public List <CardList> add6(CardList paladin) {
		cardDeck.add(paladin);
		return cardDeck;
	}
	public List <CardList> add7(CardList ranger) {
		cardDeck.add(ranger);
		return cardDeck;
	}
	public List <CardList> add8(CardList rogue) {
		cardDeck.add(rogue);
		return cardDeck;
	}
	public List <CardList> add9(CardList sorcerer) {
		cardDeck.add(sorcerer);
		return cardDeck;
	}
	public List <CardList> add10(CardList warlock) {
		cardDeck.add(warlock);
		return cardDeck;
	}
	public List <CardList> add11(CardList wizard) {
		cardDeck.add(wizard);
		return cardDeck;
	}
}

