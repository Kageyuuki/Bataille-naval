
public class MorceauBateau {
	private int x;
	private int y;
	
	public MorceauBateau(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean toucher(int x, int y) {
		boolean toucher = false;		
		if (this.x==x && this.y == y)
			toucher=true;
		return toucher;
	}

}
