package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;

	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}

	public String getNom() {
		return this.nom;
	}

	public int getArgent() {
		return this.argent;
	}

	public void parler(String texte) {
		System.out.println(this.getNom() + " - " + texte);
	}

	public void direBonjour() {
		this.parler("Bonjour! Je m'appelle " + this.getNom() + " et j'aime boire du " + this.boissonFavorite);
	}

	public void perdreArgent(int perte) {
		if (this.argent - perte >= 0) {
			this.argent -= perte;
		} else {
			this.argent = 0;
		}
	}

	public void gagnerArgent(int gain) {
		this.argent += gain;
	}

	public void acheter(String bien, int prix) {
		int argentTemp = this.getArgent();
		if (argentTemp < prix) {
			this.parler("J'ai " + argentTemp + " sous en poche. Je ne peux meme pas m'offrir un " + bien + " a " + prix
					+ " sous");
		} else {
			this.parler("J'ai " + argentTemp + " sous en poche. Je vais pouvoir m'offrir une " + bien + " a " + prix
					+ " sous");
			this.perdreArgent(prix);
		}
	}

	public void boire() {
		this.parler("Mmmm, un bon verre de " + this.boissonFavorite + "! GLOUPS!");
	}

}
