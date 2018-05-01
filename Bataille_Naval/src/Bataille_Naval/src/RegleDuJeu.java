
public class RegleDuJeu {
	private Joueur joueur1;
	private Joueur joueur2;
	
	public RegleDuJeu() {
		this.joueur1  = new Joueur(true);
		this.joueur2 = new Joueur(false);
	}

	public Joueur getJoueur1() {
		return joueur1;
	}

	public Joueur getJoueur2() {
		return joueur2;
	}
	
	
			
}
