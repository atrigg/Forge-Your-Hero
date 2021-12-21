package com.ForgeYourHero.entity;

public class Sorcerer extends CardList {

	CardGame Sorcerer = new CardGame();

	private int health = 7;
	private int attack = 9;
	private String imageUrl;
	private int currentHealth;
	private int cardName;
	private int position;

	/**
	 * @return the sorcerer
	 */
	public CardGame getSorcerer() {
		return Sorcerer;
	}

	/**
	 * @param sorcerer the sorcerer to set
	 */
	public void setSorcerer(CardGame sorcerer) {
		Sorcerer = sorcerer;
	}

	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}

	/**
	 * @return the attack
	 */
	public int getAttack() {
		return attack;
	}

	/**
	 * @param attack the attack to set
	 */
	public void setAttack(int attack) {
		this.attack = attack;
	}

	/**
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * @param imageUrl the imageUrl to set
	 */
	public void setImageUrl(String imageUrl) {
		imageUrl = "assets/img/Sorcerer Card.jpg";
		this.imageUrl = imageUrl;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	public int getCardName() {
		return cardName;
	}

	public void setCardName(int cardName) {
		this.cardName = cardName;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

}
