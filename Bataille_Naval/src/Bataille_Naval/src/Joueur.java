import java.util.ArrayList;

public class Joueur {
	private boolean sontTour;
	private ArrayList<Bateau> sesBateau;
	
	public Joueur(boolean sontTour) {
		this.setSontTour(sontTour);
		this.sesBateau = new ArrayList<Bateau>();
		// ajout de 3 destroyer
		this.sesBateau.add(new Destroyer());
		this.sesBateau.add(new Destroyer());
		this.sesBateau.add(new Destroyer());
		
		//ajout de 3 Croiseur
		this.sesBateau.add(new Croiseur());
		this.sesBateau.add(new Croiseur());
		this.sesBateau.add(new Croiseur());
		
		//ajout de 1 Cuirasse
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
			j.sesBateau.get(i).Toucher(x, y);
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
}
