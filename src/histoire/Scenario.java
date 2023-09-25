package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois asterix = new Gaulois("Asterix",8);
		Romain minus= new Romain("Minus",6);
		Druide panoramix = new Druide("Panoramix",5,10);
		Gaulois obélix = new Gaulois("Obélix",25);
		panoramix.booster(obélix);
		obélix.parler("Par Bélénos, ce n'est pas juste!");
		int yk =panoramix.preparerPotion();
		asterix.boirePotion(yk);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
	}

}
