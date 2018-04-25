import java.awt.BorderLayout;

import javax.swing.JPanel;

public class PlacemenGrille extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GrilleBoutton grille;
	
	public PlacemenGrille() {
		this.grille = new GrilleBoutton();
		this.setLayout(new BorderLayout());
		this.add(grille, BorderLayout.CENTER);
	}
}
