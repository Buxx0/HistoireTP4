package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		System.out.println("PARTIE 1:");
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.boire();
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);
		System.out.println("\nPARTIE 2:");
		Commercant marco = new Commercant("Marco", 15);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		System.out.println("\nPARTIE 3:");
		Yakuza yaku = new Yakuza("Yaku Le Noir", "coca cola", 30, "Warsong");
		yaku.direBonjour();
		yaku.parler("Tiens tiens, ne serait-ce pas un faible marchand qui passe par la?");
		yaku.extorquer(marco);
		System.out.println("\nPARTIE 4:");
		Ronin roro = new Ronin("Roro", "fanta", 60);
		roro.direBonjour();
		roro.donner(marco);
	}
}
