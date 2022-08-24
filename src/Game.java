import player.Life;
import player.Player;
import player.Skill;
import player.Weapon;
import player.Xp;

public class Game{
	public static void main (String[] args) {
		
		Player player = new Player("Joshua");
		Weapon weapon = new Weapon("Pistol",1);
		Weapon weapon2 = new Weapon("MachineGun",3);
		Skill skill = new Skill("Fireball", 20,5);
		Life life = new Life(100);	
		Xp xp = new Xp(0);
		
		System.out.printf(player.getName());
		System.out.printf("%nWeapon is %s and your damage is %d", weapon.getType(),weapon.getDamage());
		System.out.printf("%nWeapon is %s and your damage is %d", weapon2.getType(),weapon2.getDamage());
		System.out.printf("%nCongrats you've unlocked a new Skill! %s", skill.getSkillName());
		System.out.printf("%nYour life is %d now", life.getLife());
		System.out.printf("%nYour XP is %d", xp.getXp());
		
	}
	
}

