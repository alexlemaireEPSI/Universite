package Uni.uni;

public class Etudiant extends Personne {
	
	int anneEtude, fraisInscription;

	public int getAnneEtude() {
		return anneEtude;
	}

	public void setAnneEtude(int anneEtude) {
		this.anneEtude = anneEtude;
	}

	public int getFraisInscription() {
		return fraisInscription;
	}

	public void setFraisInscription(int fraisInscription) {
		this.fraisInscription = fraisInscription;
	}

	
	public Etudiant(int idP, int nSS, String nomP, String prenomP, int anneEtude) {
		super(idP, nSS, nomP, prenomP);
		this.anneEtude = anneEtude;
		this.fraisInscription = 150 * this.anneEtude;
		super.idP = 15;
	}
	
	
	public void compareFraisInscription(Etudiant e) {
		if (this.fraisInscription > e.getFraisInscription())
		{
			System.out.println("L'étudiant " + super.nomP + " " + super.prenomP + " paie plus de frais que l'étudiant" + e.getNomP() + " " + e.getPrenomP() + ".");
		}
		else if(this.fraisInscription == e.getFraisInscription())
		{
			System.out.println("L'étudiant " + super.nomP + " " + super.prenomP + " paie autant de frais que l'étudiant " + e.getNomP() + " " + e.getPrenomP() + ".");
		}
		else
		{
			System.out.println("L'étudiant " + this.nomP + " " + this.prenomP + " paie moins de frais que l'étudiant " + e.getNomP() + " " + e.getPrenomP() + ".");
		}
	}
	
	public void getInformationsEtudiant() {
		System.out.println("L\'id de l'étudiant est :" + super.idP + ".\nLe nom de l'étudiant est:"
				+ this.nomP + ".\nLe prenom de l'étudiant est: " + this.prenomP + ".\nLe numéro"
						+ "de sécurité de l'étudiant est : " + this.prenomP + ".\nLe nombre d'année"
								+ "d'études de l'étudiant est : " + this.anneEtude + "\n"
										+ "Les frais d'inscription de l'étudiant est de :" + this.fraisInscription);
	}
	
}