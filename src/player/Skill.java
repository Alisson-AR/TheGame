package player;

public class Skill {
	private String skillName;
	private int cost;
	private int damage;
	
	public Skill(String skillName, int cost, int damage) {
		this.skillName = skillName;
		this.cost = cost;
		this.damage = damage;
	}


	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
}
