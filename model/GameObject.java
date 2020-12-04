package model;

public abstract class GameObject implements IAttack{
	private int r;
	private int c;
	private int health;
	
	public GameObject(int r, int c, int health) {
		this.r = r;
		this.c = c;
		this.health = health;
	}
	public boolean isInPosition(int i, int j) { // Devuelve un boolean indicando que si el slayer
		return r == i && c == j; // se encuentra en una posici�n (i, j) dada
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
	public void decreaseCol() {
		--c;
	}
	public boolean isDead() {
		return health == 0;
	}
	public abstract void advance();
	public abstract void deleteObjects();
	public abstract void someoneWins();
	public abstract String getPositionToString(int i, int j);
	
}