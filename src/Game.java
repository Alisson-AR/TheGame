import java.util.Scanner;

import javax.swing.JOptionPane;

// Nomes: Thiago F. Santos, Anderson L. Almeida, Alisson Rosa

/*public class Game{
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);

		String msg = "Insert name player: ";
		String TituloDialog = "TheGameV2";
		String nome = JOptionPane.showInputDialog(null,msg,TituloDialog,-1);

		Player player = new Player(nome);
		Weapon weapon = new Weapon("Pistol",1);
		Weapon weapon2 = new Weapon("MachineGun",3);
		Skill skill = new Skill("Fireball", 20,5);
		Skill skill2 = new Skill("ThunderBall", 15,3);
		Skill skill3 = new Skill("IceBall", 10,1);

		Life life = new Life(100);	
		Xp xp = new Xp(0);
		Weapon weapon3 = new Weapon();
		Weapon weapon4 = new Weapon("Machine Ice", 5, "Ice Panic", 40, 30);
		
		weapon3.setType("Sol");
		weapon3.setDamage(20);

		player.setWeapon(weapon);
		player.setLife(life);
		player.setXp(xp);
		
		System.out.printf(player.getName());
		System.out.printf("%nYour life is %d PV now", life.getLife());
		System.out.printf("%nYour experience is %d xp", player.getXp().getXp());
		
		System.out.printf("%nWeapon is %s and your damage is %d%n", player.getWeapon().getType(),player.getWeapon().getDamage());
		
		
		for(int i=5;i<=20;i=i+5){
			System.out.printf("Xp of player %s = %d%n", player.getName(),player.getXp().getXp());
			xp.setXp(i);
		}
		
		if(player.getXp().getXp() == 20) {
			
			System.out.printf("%nYour XP is %d", player.getXp().getXp());
			player.setWeapon(weapon2);
			System.out.printf("%nCongrats you've unlocked a new Weapon %s and your damage is %d%n", player.getWeapon().getType(),player.getWeapon().getDamage());
			
			while(player.getXp().getXp() < 80) {
				int xpAtual = player.getXp().getXp();
				int aumentaXp = 5;
				xp.setXp(xpAtual+aumentaXp);
			}
			
			if(player.getXp().getXp() == 80) {
			
				System.out.printf("%nYour XP is %d", player.getXp().getXp());
				player.setSkill(skill);
				System.out.printf("%nCongrats you've unlocked a new Skill! %s%n", player.getSkill().getSkillName());
				xp.setXp(100);
				
				if(player.getXp().getXp() == 100) {
					
					player.setWeapon(weapon4);
					System.out.printf("%nYour XP is %d", player.getXp().getXp());
					System.out.printf("%nWeapon 4 name is %s", player.getWeapon().getType());
					System.out.printf("%nWeapon 4 damage is %d", player.getWeapon().getDamage());
					System.out.printf("%nWeapon 4 skill is %s", player.getWeapon().getSkillName());
					System.out.printf("%nWeapon 4 cost of skill is %d mana", player.getWeapon().getCost());
					System.out.printf("%nWeapon 4 damage of skill is %d", player.getWeapon().getDamag());
					
				}
			}
		}
		input.close();
	}
}
*/

