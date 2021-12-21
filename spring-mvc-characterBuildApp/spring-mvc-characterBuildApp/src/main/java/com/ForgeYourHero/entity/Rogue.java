package com.ForgeYourHero.entity;

public class Rogue extends CardList {
	

	CardGame Rogue = new CardGame();
	
	private int health = 7;
	private int attack = 8;
	private String imageUrl;
	/**
	 * @return the rogue
	 */
	public CardGame getRogue() {
		return Rogue;
	}
	/**
	 * @param rogue the rogue to set
	 */
	public void setRogue(CardGame rogue) {
		Rogue = rogue;
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
		imageUrl = "assets/img/Rogue Card.jpg";
		this.imageUrl = imageUrl;
	}
	
	

}
