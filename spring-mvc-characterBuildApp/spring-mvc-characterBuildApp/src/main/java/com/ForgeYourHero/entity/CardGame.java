package com.ForgeYourHero.entity;

import java.util.Random;

public class CardGame {

	private int value;
	Knight knight = new Knight();
	Wizard wizard = new Wizard();
	Barbarian barbarian = new Barbarian();
	Cleric cleric = new Cleric();
	Monk monk = new Monk();
	Paladin paladin = new Paladin();
	Ranger ranger = new Ranger();
	Rogue rogue = new Rogue();
	Druid druid = new Druid();
	Bard bard = new Bard();
	Sorcerer sorcerer = new Sorcerer();
	Warlock warlock = new Warlock();
	Random card = new Random();
	
	

	
	
	public int twelve = 12;
	public int result = card.nextInt(twelve);
	int tempHealth = Knight.getHealth();
	//System.out.println(result())
	
	

	/**
	 * @return the knight
	 */
	public Knight getKnight() {
		return knight;
	}

	/**
	 * @return the barbarian
	 */
	public Barbarian getBarbarian() {
		return barbarian;
	}

	/**
	 * @param barbarian the barbarian to set
	 */
	public void setBarbarian(Barbarian barbarian) {
		this.barbarian = barbarian;
	}

	/**
	 * @return the cleric
	 */
	public Cleric getCleric() {
		return cleric;
	}

	/**
	 * @param cleric the cleric to set
	 */
	public void setCleric(Cleric cleric) {
		this.cleric = cleric;
	}

	/**
	 * @return the monk
	 */
	public Monk getMonk() {
		return monk;
	}

	/**
	 * @param monk the monk to set
	 */
	public void setMonk(Monk monk) {
		this.monk = monk;
	}

	/**
	 * @return the paladin
	 */
	public Paladin getPaladin() {
		return paladin;
	}

	/**
	 * @param paladin the paladin to set
	 */
	public void setPaladin(Paladin paladin) {
		this.paladin = paladin;
	}

	/**
	 * @return the ranger
	 */
	public Ranger getRanger() {
		return ranger;
	}

	/**
	 * @param ranger the ranger to set
	 */
	public void setRanger(Ranger ranger) {
		this.ranger = ranger;
	}

	/**
	 * @return the rogue
	 */
	public Rogue getRogue() {
		return rogue;
	}

	/**
	 * @param rogue the rogue to set
	 */
	public void setRogue(Rogue rogue) {
		this.rogue = rogue;
	}

	/**
	 * @return the druid
	 */
	public Druid getDruid() {
		return druid;
	}

	/**
	 * @param druid the druid to set
	 */
	public void setDruid(Druid druid) {
		this.druid = druid;
	}

	/**
	 * @return the bard
	 */
	public Bard getBard() {
		return bard;
	}

	/**
	 * @param bard the bard to set
	 */
	public void setBard(Bard bard) {
		this.bard = bard;
	}

	/**
	 * @return the sorcerer
	 */
	public Sorcerer getSorcerer() {
		return sorcerer;
	}

	/**
	 * @param sorcerer the sorcerer to set
	 */
	public void setSorcerer(Sorcerer sorcerer) {
		this.sorcerer = sorcerer;
	}

	/**
	 * @return the warlock
	 */
	public Warlock getWarlock() {
		return warlock;
	}

	/**
	 * @param warlock the warlock to set
	 */
	public void setWarlock(Warlock warlock) {
		this.warlock = warlock;
	}

	/**
	 * @return the wizard
	 */
	public Wizard getWizard() {
		return wizard;
	}

	/**
	 * @param wizard the wizard to set
	 */
	public void setWizard(Wizard wizard) {
		this.wizard = wizard;
	}

	/**
	 * @return the card
	 */
	public Random getCard() {
		return card;
	}

	/**
	 * @param card the card to set
	 */
	public void setCard(Random card) {
		this.card = card;
	}

	/**
	 * @return the twelve
	 */
	public int getTwelve() {
		return twelve;
	}

	/**
	 * @param twelve the twelve to set
	 */
	public void setTwelve(int twelve) {
		this.twelve = twelve;
	}

	/**
	 * @return the result
	 */
	public int getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(int result) {
		this.result = result;
	}

	/**
	 * @param knight the knight to set
	 */
	public void setKnight(Knight knight) {
		this.knight = knight;
	}

	/**
	 * 
	 */
	public CardGame() {
		value = 0;
	}

	/**
	 * @param value
	 */
	public CardGame(int value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		if (value < 0) {
			this.value = 0;
		} else {
			this.value = value;
		}

	}

	public void setRandom(int minimum, int maximum) {
        Random random = new Random();
        this.value = random.nextInt(maximum - minimum) + minimum;
		
		
	}

	
	public void increment() {
		this.value++;
	}

	public int getHealth() {
		// TODO Auto-generated method stub
		return 0;
	}
}
