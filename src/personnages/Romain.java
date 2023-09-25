package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isForcePositive(force);
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert isForcePositive(forceCoup);
		int force_avant=forceCoup;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert isForceDiminue(force_avant, force);
	}
	
	public boolean isForcePositive(int force) {
		return force>=0;
	}
	
	public boolean isForceDiminue(int force_avant, int force_apres) {
		return force_avant>=force_apres;
	}
	
	public static void main(String[] args) {
		Romain sopsopus = new Romain("Sopsopus",6);
		sopsopus.prendreParole();
		sopsopus.parler("where are you");
		sopsopus.recevoirCoup(7);
	}
}
