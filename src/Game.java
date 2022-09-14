import java.util.Scanner;

import model.Classe;
import model.Life;

import javax.swing.JOptionPane;

// Nomes: Thiago F. Santos, Anderson L. Almeida, Alisson Rosa
public class Game {
    Life life1 = new Life(100);
    Classe classe1 = new Classe("Druida", life1);
}

/*
 * public class Game{
 * public static void main (String[] args) {
 * 
 * Scanner input = new Scanner(System.in);
 * 
 * String msg = "Insert name player: ";
 * String TituloDialog = "TheGameV2";
 * String nome = JOptionPane.showInputDialog(null,msg,TituloDialog,-1);
 * 
 * Player player = new Player(nome);
 *
 * //SOLDIER
 * Weapon weapon = new Weapon("Pistol,1");
 * Weapon weapon2 = new Weapon("MachineGun,3");
 * Weapon weapon3 = new Weapon("Cannon,5");
 * Weapon weapon4 = new Weapon("Grenade,6");
 * Weapon weapon5 = new Weapon("FlameThrower,15");
 * Weapon weapon6 = new Weapon("Mine,10");
 *
 * Skill skill1 = new Skill("ExplosionKing",12,16);
 * Skill skill2 = new Skill("SetOnFire",8,13);
 * Skill skill3 = new Skill("Aimer",10,20);
 * 
 * //GUERREIRO
 * Weapon weapon7 = new Weapon("Sword,5");
 * Weapon weapon8 = new Weapon("MasterSword,12");
 * Weapon weapon9 = new Weapon("LegendarySword,20");
 * Weapon weapon10 = new Weapon("Dagger,1");
 * Weapon weapon11 = new Weapon("Shield,2");
 * Weapon weapon12 = new Weapon("Spear,5");
 * Weapon weapon13 = new Weapon("Axe,9");
 *
 * Skill skill4 = new Skill("WindCuts", 15,9);
 * Skill skill5 = new Skill("BruteForce",10,15);
 * Skill skill6 = new Skill("CircularCut",10,20);
 *
 * //ARQUEIRO
 * Weapon weapon14 = new Weapon("WoodBow,5");
 * Weapon weapon15 = new Weapon("IronBow,15");
 * Weapon weapon16 = new Weapon("GoldBow,25");
 * Weapon weapon17 = new Weapon("WoodArrow,5");
 * Weapon weapon18 = new Weapon("IronArrow,15");
 * Weapon weapon19 = new Weapon("GoldArrow,25");
 *
 * Skill skill7 = new Skill("DoubleAttack",12,16);
 * Skill skill8 = new Skill("FireAttack",10,15);
 * Skill skill9 = new Skill("SpeedAttack",9,10);
 *
 * //MAGO
 * Weapon weapon20 = new Weapon("Wand,2");
 * Weapon weapon21 = new Weapon("Summon, 5");
 * Weapon weapon22 = new Weapon("DragonBreath, 15");
 * Weapon weapon23 = new Weapon("FireMagic,14");
 * Weapon weapon24 = new Weapon("WindMagic,13");
 * Weapon weapon25 = new Weapon("DomeShield,6");
 *
 * Skill skill10 = new Skill("WindBlast",6,12);
 * Skill skill11 = new Skill("FireBlast",15,20);
 * Skill skill12 = new Skill("Protection",20,25);
 *
 * //ELFO
 * Weapon weapon = new Weapon("EarthMagic,15");
 * Weapon weapon = new Weapon("LegendarySword,20");
 * Weapon weapon = new Weapon("IronBow,14");
 * Weapon weapon = new Weapon("Dagger,10");
 * Weapon weapon = new Weapon("Spear,5");
 * Weapon weapon = new Weapon("MasterSword,12");
 * Weapon weapon = new Weapon("DragonBreath, 15");
 * Weapon weapon = new Weapon("DomeShield,6");
 *
 * Skill skill13 = new Skill("TripleArrow",10,20);
 * Skill skill14 = new Skill("WindCuts", 15,9);
 * Skill skill15 = new Skill("Protection",20,25);
 *
 *
 * Life life = new Life(100);
 * 
 * Arqueiro = 98;
 * Mago = 90;
 * Elfo = 80;
 * Soldier = 95;
 * 
 *
 * Xp xp = new Xp(0);
 * 
 * weapon3.setType("Sol");
 * weapon3.setDamage(20);
 * 
 * player.setWeapon(weapon);
 * player.setLife(life);
 * player.setXp(xp);
 * 
 * System.out.printf(player.getName());
 * System.out.printf("%nYour life is %d PV now", life.getLife());
 * System.out.printf("%nYour experience is %d xp", player.getXp().getXp());
 * 
 * System.out.printf("%nWeapon is %s and your damage is %d%n",
 * player.getWeapon().getType(),player.getWeapon().getDamage());
 * 
 * 
 * for(int i=5;i<=20;i=i+5){
 * System.out.printf("Xp of player %s = %d%n",
 * player.getName(),player.getXp().getXp());
 * xp.setXp(i);
 * }
 * 
 * if(player.getXp().getXp() == 20) {
 * 
 * System.out.printf("%nYour XP is %d", player.getXp().getXp());
 * player.setWeapon(weapon2);
 * System.out.
 * printf("%nCongrats you've unlocked a new Weapon %s and your damage is %d%n",
 * player.getWeapon().getType(),player.getWeapon().getDamage());
 * 
 * while(player.getXp().getXp() < 80) {
 * int xpAtual = player.getXp().getXp();
 * int aumentaXp = 5;
 * xp.setXp(xpAtual+aumentaXp);
 * }
 * 
 * if(player.getXp().getXp() == 80) {
 * 
 * System.out.printf("%nYour XP is %d", player.getXp().getXp());
 * player.setSkill(skill);
 * System.out.printf("%nCongrats you've unlocked a new Skill! %s%n",
 * player.getSkill().getSkillName());
 * xp.setXp(100);
 * 
 * if(player.getXp().getXp() == 100) {
 * 
 * player.setWeapon(weapon4);
 * System.out.printf("%nYour XP is %d", player.getXp().getXp());
 * System.out.printf("%nWeapon 4 name is %s", player.getWeapon().getType());
 * System.out.printf("%nWeapon 4 damage is %d", player.getWeapon().getDamage());
 * System.out.printf("%nWeapon 4 skill is %s",
 * player.getWeapon().getSkillName());
 * System.out.printf("%nWeapon 4 cost of skill is %d mana",
 * player.getWeapon().getCost());
 * System.out.printf("%nWeapon 4 damage of skill is %d",
 * player.getWeapon().getDamag());
 * 
 * }
 * }
 * }
 * input.close();
 * }
 * }
 */
