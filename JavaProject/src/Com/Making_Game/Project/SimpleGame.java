package Com.Making_Game.Project;

public class SimpleGame {

	public static void main(String[] args) {

		Player1 player = new Player1("Suraj", "sword", 100);
		
//		System.out.println(player.getName());
//		System.out.println(player.getWeapon());
//		System.out.println(player.getHealth());
		
		player.damageByGun1();
		player.damageByGun1();
		player.damangeByGun2();
		player.heal();
		
//		Player2 secondPlayer = new Player2("Abhay","MacihneGun",80,false);
//		secondPlayer.damageByGun1();

	}

}
