package personnages;

public class Commercant extends Humain {
	private String boissonFavorite;

	public Commercant(String nom, int argent) {
		super(nom, "the", argent);
	}

	public void recevoir(int argent) {
		this.parler(argent + " sous! Je te remercie genereux donateur!");
	}

	public int seFaireExtorquer() {
		this.parler("J'ai tout perdu! Le monde est trop injuste!");
		int argentPerdu = this.getArgent();
		this.perdreArgent(this.getArgent());
		return argentPerdu;
	}
}
