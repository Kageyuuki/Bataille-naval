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
	private RegleDuJeu regle;
	public Panel() {
		this.cote_droit = new PlacemenGrille();
		this.cote_gauche = new PlacemenGrille();
		this.sud = new PanelSud();
		this.regle = new RegleDuJeu();
		this.nord = new JLabel("      C'est le tour de : " + this.regle.toString()  );
		//cote_gauche.setBorder(BorderFactory.createLineBorder(Color.black));

		this.setLayout(new BorderLayout());
		this.add(cote_droit, BorderLayout.EAST);
		this.add(cote_gauche, BorderLayout.WEST);
		this.add(sud, BorderLayout.SOUTH);
		this.add(nord, BorderLayout.NORTH);
		sud.getFin_de_tour().addActionListener(this);

		for (int i = 0 ; i< this.cote_droit.getButton().size() ; i++) {
			this.cote_droit.getButton().get(i).getBoutton().addActionListener(this);
		}
		for (int i = 0 ; i< this.cote_gauche.getButton().size() ; i++) {
			this.cote_gauche.getButton().get(i).getBoutton().addActionListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(sud.getFin_de_tour())){
			this.regle.ChangementDeTour();
			this.nord.setText("      C'est le tour de : " + this.regle.toString()  );
		}
		for (int i = 0 ; i< this.cote_droit.getButton().size() ; i++) {
			if (e.getSource().equals(this.cote_droit.getButton().get(i).getBoutton()))
				this.cote_droit.getButton().get(i).getBoutton().setText("toucher");
			}

		for (int i = 0 ; i< this.cote_droit.getButton().size() ; i++) {
			if (e.getSource().equals(this.cote_gauche.getButton().get(i).getBoutton())) {
				this.cote_gauche.getButton().get(i).getBoutton().setText("bateau");
				regle.AttribuerMorceau(this.cote_gauche.getButton().get(i).getX(), this.cote_gauche.getButton().get(i).getX());
				this.cote_gauche.getButton().get(i).getBoutton().setText("bateau");
			}
		}
	}
			
		
}



