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
		Weapon weapon3 = new Weapon();
		Weapon weapon4 = new Weapon("Machine Ice", 5, "Ice Panic", 40, 30);
		
		weapon3.setType("Sol");
		weapon3.setDamage(20);

		
		System.out.printf(player.getName());
		System.out.printf("%nWeapon is %s and your damage is %d", weapon.getType(),weapon.getDamage());
		System.out.printf("%nWeapon is %s and your damage is %d", weapon2.getType(),weapon2.getDamage());
		System.out.printf("%nCongrats you've unlocked a new Skill! %s", skill.getSkillName());
		System.out.printf("%nYour life is %d now", life.getLife());
		System.out.printf("%nYour XP is %d", xp.getXp());
		System.out.printf("%nWeapon 3 your damage is %d, and your name is %S", weapon3.getDamage(), weapon3.getType());
		
		System.out.printf("%nWeapon 4 name is %s", weapon4.getType());
		System.out.printf("%nWeapon 4 damage is %d", weapon4.getDamage());
		System.out.printf("%nWeapon 4 skill is %s", weapon4.getSkillName());
		System.out.printf("%nWeapon 4 cost of skill is %d", weapon4.getCost());
		System.out.printf("%nWeapon 4 damage of skill is %d", weapon4.getDamag());
	}
	
}

