import java.util.ArrayList;

public class Bateau {
	private int taille;
	private ArrayList<MorceauBateau> composantBateau;
	
	public Bateau(int taille) {
		this.taille = taille;
		this.composantBateau = new ArrayList<MorceauBateau>();
	}
	
	public void Toucher(int x, int y) {
		for (int i=0;i<composantBateau.size();i++) {
			if(composantBateau.get(i).toucher(x, y))
				composantBateau.remove(i);
		}
	}
	
	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public ArrayList<MorceauBateau> getComposantBateau() {
		return composantBateau;
	}

	public void setComposantBateau(ArrayList<MorceauBateau> composantBateau) {
		this.composantBateau = composantBateau;
	}

	public boolean couler() {
		boolean couler=true;
		if(composantBateau.isEmpty())
			couler = true;		
		return couler;		
	}
	
	public void ajoutMorceau(int x ,int y) {
		if(this.taille>this.composantBateau.size() && (composantBateau.size()==0 || (composantBateau.get(composantBateau.size()-1).getX()==x || composantBateau.get(composantBateau.size()-1).getY()==y)) && !(composantBateau.get(composantBateau.size()-1).getX()==x && composantBateau.get(composantBateau.size()-1).getY()==y))			
			this.composantBateau.add(new MorceauBateau(x, y));
		else
			System.out.println("erreur");// A revoir
	}
	
}

