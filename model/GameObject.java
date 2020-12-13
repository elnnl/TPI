package model;

public abstract class GameObject implements IAttack{
	private int r;
	private int c;
	private int health;
	private String letter;
	
	public GameObject(int r, int c, int health, String letter) {
		this.r = r;
		this.c = c;
		this.health = health;
		this.letter = letter;
	}
	public boolean isInPosition(int i, int j) { 
		return r == i && c == j; 
	}
	public int getRow() { 
		return r;
	}
	public int getCol() {
		return c;
	}
	public int getHealth() {
		return health;
	}
	public void decreaseLife(int damage) { 
		health -= damage;
	}
	public void setDeadObject() {
		health = 0;
	}
	public void decreaseCol() {
		--c;
	}
	public void increaseCol() {
		++c;
	}
	public boolean isDead() {
		return health <= 0;
	}
	public String getPositionToString(int i, int j) {
		return letter + " [" + health + "]";
	}
	public abstract void advance();
	public abstract void deleteObjects();
	public abstract boolean vampiresWins();
}
