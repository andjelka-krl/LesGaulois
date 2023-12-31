package personnages;

import personnages.Chef;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois=0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois=new Gaulois[nbVillageoisMaximum]; 
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois]=gaulois;
		nbVillageois++;
	}
	
	public Gaulois trouverHabitant(int id_g) {
		return villageois[id_g];
	}
	
	public void afficherVillageois(){
		System.out.println("Dans village du chef " + chef.getNom() +" vivent les légendaires gaulois :");
		for (int i=0;i<nbVillageois;i++) {
			System.out.println("- " + villageois[i].getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village=new Village("Village des irreductibles",30);
		//Gaulois gaulois = village.trouverHabitant(30);
		//le tableau est vide pour l'instant et surtout 30 est out of range
		Chef abraracourcix=new Chef("Abraracourcix",6,village);
		village.setChef(abraracourcix);
		Gaulois asterix=new Gaulois("Asterix",8);
		village.ajouterHabitant(asterix);
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
//		le tableau à l'indice 1 ne pointe sur rien :(
		Gaulois obelix=new Gaulois("Obélix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}

}
