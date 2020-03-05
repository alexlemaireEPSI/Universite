package Uni.uni;

public class Professeur extends Personne{
	
	int salaire, anciennette;

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	public int getAnciennette() {
		return anciennette;
	}

	public void setAnciennette(int anciennette) {
		this.anciennette = anciennette;
	}

	
	public Professeur(int idP, int nSS, String nomP, String prenomP, int anciennette) {
		super(idP, nSS, nomP, prenomP);
		this.anciennette = anciennette;
		this.salaire = this.anciennette * 50 + 1600;
	}
	
	
	
}

