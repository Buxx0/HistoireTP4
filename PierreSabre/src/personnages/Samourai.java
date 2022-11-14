package personnages;

public class Samourai extends Ronin {
	private String seigneur;

	public Samourai(String seigneur, String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
		// TODO Auto-generated constructor stub
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur " + this.seigneur + ".");
	}
	
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson + ".");
	}

}
