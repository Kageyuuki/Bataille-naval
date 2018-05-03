import java.util.ArrayList;

public class Joueur {
	private boolean sontTour;
	private ArrayList<Bateau> sesBateau;
	private ArrayList<CaseBoutton> casejouer;
	public ArrayList<CaseBoutton> getCasejouer() {
		return casejouer;
	}

	public void setCasejouer(ArrayList<CaseBoutton> casejouer) {
		this.casejouer = casejouer;
	}

	public Joueur(boolean sontTour) {
		this.setSontTour(sontTour);
		this.sesBateau = new ArrayList<Bateau>();
		// ajout de 3 destroyer (position 0 a 2)(composition 2 morceau)
		this.sesBateau.add(new Destroyer());
		this.sesBateau.add(new Destroyer());
		this.sesBateau.add(new Destroyer());
		
		//ajout de 3 Croiseur (position 3 a 5)(composition 3 morceau)
		this.sesBateau.add(new Croiseur());
		this.sesBateau.add(new Croiseur());
		this.sesBateau.add(new Croiseur());
		
		//ajout de 1 Cuirasse position 6(composition 4 morceau)
		this.sesBateau.add(new Cuirasse());
		

	}

	public void finDeTour() {
		this.setSontTour(false);
	}
	public ArrayList<Bateau> getSesBateau() {
		return sesBateau;
	}
	public void setSesBateau(ArrayList<Bateau> sesBateau) {
		this.sesBateau = sesBateau;
	}
	public void debutTour() {
		this.setSontTour(true);
	}
	public void tirer(Joueur j,int x , int y) {
		for (int i=0 ; i< j.sesBateau.size() ;i++) {
			j.sesBateau.get(i).toucher(x, y);
			j.couler();			
		}	
	}
	
	public void couler() {
		for (int i=0 ; i< this.sesBateau.size() ;i++) {
			if (this.sesBateau.get(i).couler())
				this.sesBateau.remove(i);
		}
	}
	public boolean isSontTour() {
		return sontTour;
	}
	public void setSontTour(boolean sontTour) {
		this.sontTour = sontTour;
	}
	
	public void addCaseJoueur(CaseBoutton c) {
		this.casejouer.add(c);
	}
}
