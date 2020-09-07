package gameOrejitas;

public abstract class Character {
	private int posX;
	private int posY;
	
	public Character(int px, int py) {
		setPosX(px);
		setPosY(py);
	}
	
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	
	
}
