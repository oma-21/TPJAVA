package Partie1;



public class Vehicule {
//Attributs proteges
	protected String matricule;
	protected String marque;
	//Constructeure parametre
	public Vehicule(String matricule, String marque ) {
		this.matricule= matricule;
		this.marque=marque;
			}
	//
	
	 public void Stationner() {
	        System.out.println("le vehicule se gare dans le parking");
	 }
	 public void afficher() {
	        System.out.println("Matrucle:"+matricule+",marque:"+ marque);
	 }

	 public void stationner() {
		
		
	 }
}
