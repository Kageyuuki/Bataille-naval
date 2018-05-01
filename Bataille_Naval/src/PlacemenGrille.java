import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PlacemenGrille extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GrilleBoutton grille;
	private JLabel blanc1;
	private JLabel blanc2;
	private JLabel espace;
	public PlacemenGrille() {
		this.grille = new GrilleBoutton();
		this.setLayout(new BorderLayout());
		this.blanc1 = (new JLabel("                "));
		this.blanc2 = (new JLabel("                "));
		this.espace = (new JLabel("                "));
		this.add(grille, BorderLayout.CENTER);
		this.add(blanc2, BorderLayout.EAST);
		this.add(blanc1, BorderLayout.WEST);
		this.add(espace, BorderLayout.SOUTH);
	}

	public ArrayList<CaseBoutton> getButton() {
		return grille.getListeBoutton();
		
	}
}
