
public class Enemy {
	private int x;
	private int y;
	private int sirina;
	private int duzina;
	private int dmg;
	
	public Enemy(int x,int y,int sirina,int duzina,int dmg) {
		this.x=x;
		this.y=y;
		this.sirina=sirina;
		this.duzina=duzina;
		this.dmg=dmg;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getSirina() {
		return sirina;
	}
	public void setSirina(int sirina) {
		this.sirina = sirina;
	}
	public int getDuzina() {
		return duzina;
	}
	public void setDuzina(int duzina) {
		this.duzina = duzina;
	}
	public int getDmg() {
		return dmg;
	}
	public void setDmg(int dmg) {
		this.dmg = dmg;
	}

	public static void main(String[] args) {

	}

}
