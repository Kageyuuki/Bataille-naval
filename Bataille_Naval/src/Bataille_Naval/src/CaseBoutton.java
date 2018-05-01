import javax.swing.JButton;

public class CaseBoutton {
	private JButton boutton;
	private int x;//numero de la  collonne  
	private int y ;//numero de la ligne
	public CaseBoutton( int x, int y) {
		this.boutton = new JButton();
		this.x = x;
		this.y = y;
	}
	public JButton getBoutton() {
		return boutton;
	}
	public void setBoutton(JButton boutton) {
		this.boutton = boutton;
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
}
