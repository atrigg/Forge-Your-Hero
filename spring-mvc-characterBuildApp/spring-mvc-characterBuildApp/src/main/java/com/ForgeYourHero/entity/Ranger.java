package com.ForgeYourHero.entity;

public class Ranger extends CardList {

	CardGame Ranger = new CardGame();

	private int health = 7;
	private int attack = 9;
	private String imageUrl;
	private int currentHealth;
	private int cardName;
	private int position;

	/**
	 * @return the ranger
	 */
	public CardGame getRanger() {
		return Ranger;
	}

	/**
	 * @param ranger the ranger to set
	 */
	public void setRanger(CardGame ranger) {
		Ranger = ranger;
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
		imageUrl = "assets/img/Ranger Card.jpg";
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
