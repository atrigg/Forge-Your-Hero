package com.ForgeYourHero.entity;

public class CardDeck extends CardList {
	
	private int fullHealth;
	private int fullAttack;
	private int currentHealth;
	private int cardName;
	/**
	 * @return the fullHealth
	 */
	public int getFullHealth() {
		return fullHealth;
	}
	/**
	 * @param fullHealth the fullHealth to set
	 */
	public void setFullHealth(int fullHealth) {
		this.fullHealth = fullHealth;
	}
	/**
	 * @return the fullAttack
	 */
	public int getFullAttack() {
		return fullAttack;
	}
	/**
	 * @param fullAttack the fullAttack to set
	 */
	public void setFullAttack(int fullAttack) {
		this.fullAttack = fullAttack;
	}
	/**
	 * @return the currentHealth
	 */
	public int getCurrentHealth() {
		return currentHealth;
	}
	/**
	 * @param currentHealth the currentHealth to set
	 */
	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}
	/**
	 * @return the cardName
	 */
	public int getCardName() {
		return cardName;
	}
	/**
	 * @param cardName the cardName to set
	 */
	public void setCardName(int cardName) {
		this.cardName = cardName;
	}
	@Override
	public String toString() {
		return "CardDeck [fullHealth=" + fullHealth + ", fullAttack=" + fullAttack + ", currentHealth=" + currentHealth
				+ ", cardName=" + cardName + "]";
	}
	
	

}
