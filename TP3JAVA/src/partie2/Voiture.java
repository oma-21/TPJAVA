package partie2;
import Partie1.Vehicule; 
public class Voiture extends Vehicule {
	//Attributs supplementaire
	private int nbPortes;
	//COSTRUCTEUR 
	public Voiture(String matricule, String marque,int nbportes, int nbPortes ) {
		super(matricule,marque);
		this.nbPortes=nbPortes;
		
	
	}
	 @Override
	    public void stationner() {
	        System.out.println("La voiture se gare dans une place standard.");
	    }
	    
	    // Redéfinition de afficher()
	    @Override
	    public void afficher() {
	        super.afficher();
	        System.out.println("Nombre de portes : " + nbPortes);
	        System.out.println("Type : Voiture");
	    }
}
