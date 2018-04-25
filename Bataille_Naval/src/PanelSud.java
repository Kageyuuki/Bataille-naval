import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelSud extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton fin_de_tour;
	private JButton abandonner;
	private JLabel vide1;
	private JLabel vide2;
	
	public PanelSud() {
		fin_de_tour = new JButton("Fin de tour");
		abandonner = new JButton("Abandonner");
		vide1 = new JLabel("");
		vide2 = new JLabel("");
		this.setLayout(new GridLayout(1,4));
		this.add(vide1);
		this.add(abandonner);
		this.add(fin_de_tour);
		this.add(vide2);
	}

	public JButton getFin_de_tour() {
		return fin_de_tour;
	}


	public JButton getAbandonner() {
		return abandonner;
	}


	
}
