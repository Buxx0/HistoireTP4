package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	private Humain[] memoire = new Humain[30];
	private int nbConnaissances = 0;

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
	
	public void repondre(Humain autreHumain) {
		this.direBonjour();
		this.memoriser(autreHumain);
	}
	
	public void memoriser(Humain autreHumain) {
		if (this.nbConnaissances < 30) {
			this.memoire[this.nbConnaissances] = autreHumain;
			this.nbConnaissances++;
		} else {
			for (int i = 0; i < 29; i++) {
				this.memoire[i] = this.memoire[i + 1];
			}
			this.memoire[29] = autreHumain;
		}
	}
	
	public void faireConnaisanceAvec(Humain autreHumain) {
		String specThis = this.getClass().getSimpleName().toLowerCase();
		String specAutre = autreHumain.getClass().getSimpleName().toLowerCase();
		if (specThis.equals(specAutre)) {
			System.out.println("Le " + specThis + " " + this.getNom() + " rencontre un autre " + specAutre);
		} else {
			System.out.println("Le " + specThis + " " + this.getNom() + " rencontre le " + specAutre);
		}
		this.direBonjour();
		autreHumain.repondre(this);
		this.memoriser(autreHumain);
	}
	
	public void listerConnaissance() {
		String message = "Je connais beaucoup de monde, dont:";
		for (int i = 0; i < this.nbConnaissances; i++) {
			message += " " + this.memoire[i].getNom();
			if (i != this.nbConnaissances - 1) message += ",";
		} 
		this.parler(message);
	}

	public String getBoissonFavorite() {
		return boissonFavorite;
	}
}
