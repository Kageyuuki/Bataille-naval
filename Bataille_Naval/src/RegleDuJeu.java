
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

	@Override
	public String toString() {
		String joueurRetourner = " ";
		if (this.joueur1.isSontTour())
			joueurRetourner = "Joueur 1 ";
		else
			joueurRetourner = "Joueur 2 ";
		return joueurRetourner;
	}
	
	public void ChangementDeTour() {
		if(this.joueur1.isSontTour()) {
			this.joueur1.finDeTour();
			this.joueur2.debutTour();
		}
		else {			
			this.joueur1.debutTour();
			this.joueur2.finDeTour();
		}
	}
	public void AttribuerMorceau(int x , int y ) {
		int i = 0;
		if(this.joueur1.isSontTour()) {
		while (this.joueur1.getSesBateau().get(i).getComposantBateau().size()==this.joueur1.getSesBateau().get(i).getTaille())
			i++;
			this.joueur1.getSesBateau().get(i).ajoutMorceau(x, y);
		}
		else {
		while (this.joueur2.getSesBateau().get(i).getComposantBateau().size()==this.joueur2.getSesBateau().get(i).getTaille())
			i++;
			this.joueur2.getSesBateau().get(i).ajoutMorceau(x, y);
		}
	}		
}
