package personnages;
import java.util.Random;

public class Traitre extends Samourai{
	private int niveauTraitrise = 0;

	public Traitre(String seigneur, String nom, String boissonFavorite, int argent) {
		super(seigneur, nom, boissonFavorite, argent);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traitre et mon niveau de traitrise est: " + this.niveauTraitrise + ". Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		if (this.niveauTraitrise < 3) {
			int argentCommercant = commercant.getArgent();
			int argentRanconner = argentCommercant*(2/10);
			commercant.perdreArgent(argentRanconner);
			this.gagnerArgent(argentRanconner);
			this.niveauTraitrise++;
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne moi " + argentRanconner + " sous ou gare a toi !");
			commercant.parler("Tout de suite grand " + this.getNom() + ".");
			
		} else {
			parler("Mince je ne peux plus ranconner personne sinon un samourai risque de me demasquer !");
		}	
	}
	
	public void faireLeGentil() {
		if (this.getNbConnaissances() < 1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
		} else {
			Random rand = new Random();
			int ami_choisi = rand.nextInt(0, this.getNbConnaissances());
			int don = this.getArgent() * (1/20);
			Humain ami = this.getMemoire()[ami_choisi];
			String nomAmi = ami.getNom();
			parler("Il faut absolument remonter ma cote de confience. Je vais faire ami ami avec " + nomAmi + ".");
			//TODO finir methode.
		}
		
	}

}
