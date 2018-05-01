import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JPanel implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PlacemenGrille cote_droit;
	private PlacemenGrille cote_gauche;
	private PanelSud sud;
	private JLabel nord;
	
	public Panel() {
		this.cote_droit = new PlacemenGrille();
		this.cote_gauche = new PlacemenGrille();
		this.sud = new PanelSud();
		this.nord = new JLabel("      C'est le tour de : ");
		//cote_gauche.setBorder(BorderFactory.createLineBorder(Color.black));

		this.setLayout(new BorderLayout());
		this.add(cote_droit, BorderLayout.EAST);
		this.add(cote_gauche, BorderLayout.WEST);
		this.add(sud, BorderLayout.SOUTH);
		this.add(nord, BorderLayout.NORTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
