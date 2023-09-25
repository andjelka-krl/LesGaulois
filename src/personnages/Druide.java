package personnages;

import java.util.Random;
import personnages.Gaulois;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à " + effetPotionMax + ".");
	}
	
	public String getNom() {
		return nom;
	}
	
	public int preparerPotion() {
		Random nb_r = new Random();
		int nb_random = nb_r.nextInt(effetPotionMax);
		while (nb_random<effetPotionMin)
			nb_random = nb_r.nextInt(effetPotionMax);
		if (nb_random > 7) {
			System.out.println("J'ai préparé une super potion de force " + nb_random);
			return nb_random;
		}
		else {
			System.out.println("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + nb_random);
			return nb_random;
		}
	}
	
	public void booster(Gaulois cutie) {
		int force =preparerPotion();
		if (cutie.getNom()=="Obélix")
			System.out.println("Non Obélix!... Tu n'aura pas de potion magique!");
		else
			cutie.boirePotion(force);
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panorammix",5,10);
//		int miam=panoramix.preparerPotion();
//		System.out.println(miam);
//		Gaulois Obélix = new Gaulois("Obélix",6);
//		panoramix.booster(Obélix);
	}

}
