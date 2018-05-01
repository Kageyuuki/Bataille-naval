import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Fenetre extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public Fenetre() {
		
		this.setIconImage(new ImageIcon("../Bataille_Naval/bataille.png").getImage()); // Fonctionnais chez mes parents mais visiblement pas avec mon pc
		this.setSize(1200,600);
		this.setTitle("Bataille Naval");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		this.getContentPane().add(new Panel());
		this.setVisible(true);
	}
}
