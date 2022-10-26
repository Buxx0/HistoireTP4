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
		return nom;
	}


	public int getArgent() {
		return argent;
	}
	
	public void parler(String texte) {
		System.out.println(getNom() + " - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour! Je m'appelle " + getNom() + " et j'aime boire du " + boissonFavorite);
	}
	
	
	public void perdreArgent(int perte) {
		argent -= perte;
	}
	
	public void gagnerArgent(int gain) {
		argent += gain;
	}
	
	public void acheter(String bien, int prix) {
		int argentTemp = getArgent();
		if (argentTemp < prix) {
			parler("J'ai " + argentTemp + " sous en poche. Je ne peux meme pas m'offrir un " 
		+ bien + " a " + prix + " sous");
		} else {
			parler("J'ai " + argentTemp + " sous en poche. Je vais pouvoir m'offrir une " 
		+ bien + " a " + prix + " sous");
			perdreArgent(prix);
		}
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + "! GLOUPS!");
	}
	
}
