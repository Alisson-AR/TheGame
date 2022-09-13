package model;

public class Player {
	private String name;
	private Life life;
	private Skill skill;
	private Xp xp;
	private Weapon weapon;
	
	public Player (String name) {
		this.name = name;
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

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public Xp getXp() {
		return xp;
	}

	public void setXp(Xp xp) {
		this.xp = xp;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	
}
