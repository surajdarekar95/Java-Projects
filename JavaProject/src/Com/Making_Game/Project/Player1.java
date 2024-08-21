package Com.Making_Game.Project;

public class Player1 {

	private String name;
	private String weapon;
	private int health;

	public Player1(String name, String weapon, int health) {
		this.name = name;
		this.weapon = weapon;
		if (health < 0 || health > 100) {
			this.health = 100;
		} else
			this.health = health;

	}

	public void damageByGun1() {
		this.health -= 30;
		if (this.health <= 0) {
			this.health = 0;
		}
		System.out.println("Hit by gun 1. Health is reduced by 30." + " New health is " + this.health);

		if (this.health == 0) {
			System.out.println(getName() + "Your Game over Hit by gun1");
		}
	}

	public void damangeByGun2() {
		this.health -= 50;
		if (this.health <= 0) {
			this.health = 0;
		}
		System.out.println("Hit by gun 2. Health is reduced by 50." + " New health is " + this.health);

		if (this.health == 0) {
			System.out.println(getName() + " Your Game over Hit by gun2");
		}
	}

	public void heal() {
		if(this.health<=0) {
			System.out.println("Heal is not possible player is dead");
		}else {
			this.health=100;
			System.out.println("New health is "+this.health);
		}
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

}
