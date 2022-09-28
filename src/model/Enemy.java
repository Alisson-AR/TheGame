package model;

public class Enemy {
	private String name;
	private Life life;
	private Weapon weapon;
	private Classe classe;

	public Enemy(String name, Weapon weapon,Life life) {
		this.name = name;
		this.life = life;
		this.weapon = weapon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Life getLife() {
		return life;
	}

	public void setLife(Life life) {
		this.life = life;
	}

	public Weapon getWeapon() {
		return weapon;
	}
	
	public void setWeapon(Weapon weapon){
		this.weapon = weapon;	
	}
	
}
