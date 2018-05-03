import java.util.ArrayList;

public class Bateau {
	private int taille;
	private ArrayList<MorceauBateau> composantBateau;
	
	public Bateau(int taille) {
		this.taille = taille;
		this.composantBateau = new ArrayList<MorceauBateau>();
	}
	
	public void toucher(int x, int y) {
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
		if (this.estPossible(x,y)) {
			this.composantBateau.add(new MorceauBateau(x,y));
			System.out.println("ça ajoute "+  this.taille +" "+ this.composantBateau.size());
		}
		else System.out.println("ça ajoute pas "+  this.taille +" "+ this.composantBateau.size());
				
					
	}


	public boolean estPossible(int x , int y ) {
		boolean estPossible =false;
		if (this.taille>this.composantBateau.size()) {
			if( (composantBateau.size()==0)) {
				System.out.println("size = 0");
				estPossible=true;
			}
			else {
				for (int i = 0 ;i<this.composantBateau.size();i++) {
					if (this.composantBateau.get(i).getX()==x || this.composantBateau.get(i).getY()==y) {						
						if (this.composantBateau.get(i).getX()==x) {
							if (this.composantBateau.get(i).getY()==y+1 || this.composantBateau.get(i).getY()==y-1)
								estPossible=true;

						}
						if (this.composantBateau.get(i).getY()==y) {
							if (this.composantBateau.get(i).getX()==x+1 || this.composantBateau.get(i).getX()==x-1)
								estPossible=true;
						}
					}
					if(((this.composantBateau.get(i).getX()==x) && (this.composantBateau.get(i).getY()==y))) 
						estPossible=false;											
				}
			}
		}
		return estPossible;
		
	}
	
}

