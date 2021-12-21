package com.ForgeYourHero.entity;

public class Knight extends CardList {

	CardGame Knight = new CardGame();

	private int health = 10;
	private static int attack = 12;
	private String imageUrl;
	private int currentHealth;
	private int cardName;
	private int position;

	/**
	 * @return the knight
	 */
	public CardGame getKnight() {
		return Knight;
	}

	/**
	 * @param knight the knight to set
	 */
	public void setKnight(CardGame knight) {
		Knight = knight;
	}

	/**
	 * @return the health
	 */
	public static int getHealth() {
		try {
			return attack;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return attack;
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

	/**
	 * @param imageUrl the imageUrl to set
	 */
	public void setImageUrl(String imageUrl) {
		imageUrl = "assets/img/Knight Card.jpg";
		this.imageUrl = imageUrl;
	}

}
