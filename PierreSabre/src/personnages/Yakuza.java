package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}

	public void extorquer(Commercant victime) {
		this.parler(victime.getNom() + ", si tu tiens a la vie donne moi ta bourse!");
		int argentPris = victime.seFaireExtorquer();
		this.gagnerArgent(argentPris);
		this.reputation++;
		this.parler("J'ai pique " + argentPris + " sous de " + victime.getNom() + ", ce qui me fait " + this.getArgent()
				+ " dans ma poche. Hi ! Hi !");
	}
}
