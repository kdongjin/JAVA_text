
public class Unit {
	private String name;
	private int hp;
	private int damage; 
	private int speed; 

	public Unit() {
		this(null, 0, 0, 0); 
	}

	public Unit(String name, int hp, int damage, int speed) {
		super();
		this.name = name;
		this.hp = hp;
		this.damage = damage;
		this.speed = speed;
	}
	
	
}
