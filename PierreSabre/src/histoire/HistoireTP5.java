package histoire;

import personnages.*;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku le noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
		
		marco.faireConnaisanceAvec(roro);
		marco.faireConnaisanceAvec(yaku);
		marco.faireConnaisanceAvec(chonin);
		marco.faireConnaisanceAvec(kumi);
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		
		System.out.println("\n\n\n");
		akimoto.faireConnaisanceAvec(marco);
		akimoto.listerConnaissance();
		akimoto.boire("the");
	}
}
