
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
	

	public void changementDeTour() {
		if(this.joueur1.isSontTour()) {
			this.joueur1.finDeTour();
			this.joueur2.debutTour();
		}
		else {			
			this.joueur1.debutTour();
			this.joueur2.finDeTour();
		}
	}
	public String attribuerMorceau(int x , int y ) {
		int i = 0;
		String nom = null;
		try {
		if(this.joueur1.isSontTour()) {
		while (this.joueur1.getSesBateau().get(i).getComposantBateau().size()==this.joueur1.getSesBateau().get(i).getTaille())
			i++;
			this.joueur1.getSesBateau().get(i).ajoutMorceau(x, y);
			nom = this.joueur1.getSesBateau().get(i).getClass().getName() +" "+ i+1 +this.joueur1.getSesBateau().get(i).getComposantBateau().size() ;
		}
		else {
		while (this.joueur2.getSesBateau().get(i).getComposantBateau().size()==this.joueur2.getSesBateau().get(i).getTaille())
			i++;
			this.joueur2.getSesBateau().get(i).ajoutMorceau(x, y);
			nom = this.joueur2.getSesBateau().get(i).getClass().getName() +" "+ i+1 +this.joueur2.getSesBateau().get(i).getComposantBateau().size() ;

		}
		}catch (java.lang.IndexOutOfBoundsException e) {
			nom = null;
		}
	
		
		return nom;
	}
	
	public boolean morceauCompatible(int x , int y) {
		int i = 0;
		boolean estCompatible = false;
		if(this.joueur1.isSontTour()) {
		while (this.joueur1.getSesBateau().get(i).getComposantBateau().size()==this.joueur1.getSesBateau().get(i).getTaille())
			i++;
			estCompatible = this.joueur1.getSesBateau().get(i).estPossible(x, y);
		}
		else {
		while (this.joueur2.getSesBateau().get(i).getComposantBateau().size()==this.joueur2.getSesBateau().get(i).getTaille())
			i++;
		}
		return estCompatible;
	}
	
	public boolean estToucher(int x , int y) {
		boolean estToucher = false;
		int i;
		int j;
		try {
		if (this.joueur1.isSontTour()) {
			for (i = 0 ; i<this.joueur2.getSesBateau().size();i++) {
				for (j=0 ; j<this.joueur2.getSesBateau().get(i).getComposantBateau().size() ; j++) {
					estToucher = this.joueur2.getSesBateau().get(i).getComposantBateau().get(j).toucher(x, y);

				}
			}
		}
		if (this.joueur2.isSontTour()) {
			for (i = 0 ; i<this.joueur2.getSesBateau().size();i++) {
				for (j=0 ; j<this.joueur1.getSesBateau().get(i).getComposantBateau().size() ; j++) {
					estToucher = this.joueur1.getSesBateau().get(i).getComposantBateau().get(j).toucher(x, y);
				}
			}
		}
		}catch (java.lang.NullPointerException e) {
			estToucher=false;
		}
		return estToucher;
	}
	
	public void toucher(int x , int y , CaseBoutton c) {
		int i;
		if (this.joueur1.isSontTour()){
			for (i = 0 ; i<this.joueur2.getSesBateau().size();i++) {
				this.joueur2.getSesBateau().get(i).toucher(x, y);
				this.joueur1.addCaseJoueur(c);
			}
		}	
		if(this.joueur2.isSontTour()) {
			for (i = 0 ; i<this.joueur1.getSesBateau().size();i++) {
				this.joueur1.getSesBateau().get(i).toucher(x, y);
				this.joueur2.addCaseJoueur(c);
			}
		}			
	}
	
	
}

