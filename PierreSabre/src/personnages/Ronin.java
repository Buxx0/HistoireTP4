package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int argentDonne = (int) (getArgent() * 0.1);
		parler(beneficiaire.getNom() + " prend ses " + argentDonne + " sous.");
		beneficiaire.recevoir(argentDonne);
		this.perdreArgent(argentDonne);
		this.honneur++;
	}
	

}
